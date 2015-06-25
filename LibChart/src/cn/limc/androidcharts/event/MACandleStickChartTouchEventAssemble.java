/*
 * MACandleStickChartTouchEventAssemble.java
 * Android-Charts
 *
 * Created by limc on 2011/05/29.
 *
 * Copyright 2011 limc.cn All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.limc.androidcharts.event;

import java.util.List;

import cn.limc.androidcharts.entity.DateValueEntity;
import cn.limc.androidcharts.entity.IChartData;
import cn.limc.androidcharts.entity.IStickEntity;
import cn.limc.androidcharts.entity.LineEntity;
import cn.limc.androidcharts.entity.OHLCEntity;
import cn.limc.androidcharts.view.GridChart;
import cn.limc.androidcharts.view.MACandleStickChart;

import android.graphics.Color;
import android.widget.TextView;

public class MACandleStickChartTouchEventAssemble implements
		ITouchEventResponse {

	private TextView tvMA5;
	private TextView tvMA10;
	private TextView tvMA25;
	private TextView tvO;
	private TextView tvH;
	private TextView tvL;
	private TextView tvC;
	private TextView tvD;

	private TextView tvValue;
	private TextView tvChange;

	public void notifyEvent(GridChart chart, int ix) {
		 int index =ix;

		 MACandleStickChart machart = (MACandleStickChart) chart;
		
		 IChartData<IStickEntity> ohlcData = machart.getStickData();
		 List<LineEntity<DateValueEntity>> lineData = machart.getLinesData();
		
		 if (null == ohlcData || null == lineData) {
		 return;
		 }
		
		 LineEntity<DateValueEntity> ma5 = lineData.get(0);
		 LineEntity<DateValueEntity> ma10 = lineData.get(1);
		 LineEntity<DateValueEntity> ma25 = lineData.get(2);
		
		 if (index >= ohlcData.size() || index < 0) {
		 return;
		 // index = OHLCData.size() -1;
		 }
		
		 OHLCEntity entity = (OHLCEntity)ohlcData.get(index);
		 OHLCEntity entity1;
		
		 if (index >= ohlcData.size()) {
		 index = ohlcData.size() - 1;
		 }
		
		 if (index > 0) {
		 entity1 = (OHLCEntity)ohlcData.get(index - 1);
		 } else {
		 entity1 = entity;
		 }
		 double close = entity1.getClose();
		
		 if (null != tvO) {
		 tvO.setText(String.valueOf((int) (entity.getOpen())));
		 tvO.setTextColor(getColor(entity.getOpen(), close));
		 }
		 if (null != tvH) {
		 tvH.setText(String.valueOf((int) (entity.getHigh())));
		 tvH.setTextColor(getColor(entity.getHigh(), close));
		 }
		 if (null != tvL) {
		 tvL.setText(String.valueOf((int) (entity.getLow())));
		 tvL.setTextColor(getColor(entity.getLow(), close));
		 }
		 if (null != tvC) {
		 tvC.setText(String.valueOf((int) (entity.getClose())));
		 tvC.setTextColor(getColor(entity.getClose(), close));
		 }
		 if (null != tvD) {
		 String date = String.valueOf((int) (entity.getDate())).substring(2);
		 tvD.setText(new StringBuffer().append(date.substring(0, 2))
		 .append("/").append(date.substring(2, 4)).append("/")
		 .append(date.substring(4, 6)).toString());
		 }
		
		 int change = (int) (entity.getClose() - close);
		 float rate = ((int) (change / close * 10000)) / 100f;
		 String strRate = String.valueOf(rate) + "%";
		
		 if (null != tvValue) {
		 tvValue.setText(String.valueOf((int) (entity.getClose())));
		 tvValue.setTextColor(getColor(entity.getClose(), close));
		 }
		 if (null != tvChange) {
		 tvChange.setText(new StringBuffer().append(change > 0 ? "+" : "")
		 .append(String.valueOf(change)).append("(").append(strRate)
		 .append(")").toString());
		 tvChange.setTextColor(getColor(entity.getClose(), close));
		 }

		 tvMA5.setText(ma5.getTitle() + "="
		 +String.valueOf((int)ma5.getLineData().get(index).getValue()));
		 tvMA5.setTextColor(ma5.getLineColor());
		 tvMA10.setText(ma10.getTitle() + "="
		 +String.valueOf((int)ma10.getLineData().get(index).getValue()));
		 tvMA10.setTextColor(ma10.getLineColor());
		 tvMA25.setText(ma25.getTitle() + "="
		 +String.valueOf((int)ma25.getLineData().get(index).getValue()));
		 tvMA25.setTextColor(ma25.getLineColor());
	}

	public void notifyEvent(GridChart chart) {

		MACandleStickChart machart = (MACandleStickChart) chart;

		int index = machart.getSelectedIndex();

		notifyEvent(chart, index);

	}

	private int getColor(double value, double yesterclose) {
		int color = Color.WHITE;
		if (value < yesterclose) {
			color = Color.GREEN;
		} else if (value > yesterclose) {
			color = Color.RED;
		} else {
			color = Color.WHITE;
		}
		return color;
	}

	public TextView getTvMA5() {
		return tvMA5;
	}

	public void setTvMA5(TextView tvMA5) {
		this.tvMA5 = tvMA5;
	}

	public TextView getTvMA10() {
		return tvMA10;
	}

	public void setTvMA10(TextView tvMA10) {
		this.tvMA10 = tvMA10;
	}

	public TextView getTvMA25() {
		return tvMA25;
	}

	public void setTvMA25(TextView tvMA25) {
		this.tvMA25 = tvMA25;
	}

	public TextView getTvO() {
		return tvO;
	}

	public void setTvO(TextView tvO) {
		this.tvO = tvO;
	}

	public TextView getTvH() {
		return tvH;
	}

	public void setTvH(TextView tvH) {
		this.tvH = tvH;
	}

	public TextView getTvL() {
		return tvL;
	}

	public void setTvL(TextView tvL) {
		this.tvL = tvL;
	}

	public TextView getTvC() {
		return tvC;
	}

	public void setTvC(TextView tvC) {
		this.tvC = tvC;
	}

	public TextView getTvD() {
		return tvD;
	}

	public void setTvD(TextView tvD) {
		this.tvD = tvD;
	}

	public TextView getTvValue() {
		return tvValue;
	}

	public void setTvValue(TextView tvValue) {
		this.tvValue = tvValue;
	}

	public TextView getTvChange() {
		return tvChange;
	}

	public void setTvChange(TextView tvChange) {
		this.tvChange = tvChange;
	}

}
