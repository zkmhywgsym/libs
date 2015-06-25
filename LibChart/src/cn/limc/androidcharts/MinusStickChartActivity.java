package cn.limc.androidcharts;

import java.util.ArrayList;
import java.util.List;

import cn.limc.androidcharts.entity.IStickEntity;
import cn.limc.androidcharts.entity.ListChartData;
import cn.limc.androidcharts.entity.StickEntity;
import cn.limc.androidcharts.view.GridChart;
import cn.limc.androidcharts.view.MinusStickChart;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
//均线图
public class MinusStickChartActivity extends Activity {

	MinusStickChart minusstickchart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.minus_stick_chart_layout);
		initMinusStickChart();
	}
	private void initMinusStickChart() {
		this.minusstickchart = (MinusStickChart) findViewById(R.id.minusstickchart);

		List<IStickEntity> data = new ArrayList<IStickEntity>();
		data.add(new StickEntity(50000, 0, 20110603));
		data.add(new StickEntity(42000, 0, 20110703));
		data.add(new StickEntity(32000, 0, 20110803));
		data.add(new StickEntity(21000, 0, 20110903));
		data.add(new StickEntity(0, -12000, 20111003));
		data.add(new StickEntity(0, -28000, 20111103));
		data.add(new StickEntity(0, -41000, 20111203));
		data.add(new StickEntity(0, -25000, 20120103));
		data.add(new StickEntity(0, -18000, 20120203));
		data.add(new StickEntity(14000, 0, 20120303));
		data.add(new StickEntity(24000, 0, 20120303));
		data.add(new StickEntity(36000, 0, 20120303));
		data.add(new StickEntity(46000, 0, 20120303));
		minusstickchart.setStickData(new ListChartData<IStickEntity>(data));

		minusstickchart.setMaxSticksNum(data.size());
		minusstickchart.setMaxValue(50000);
		minusstickchart.setMinValue(-50000);

		minusstickchart.setBorderColor(Color.GRAY);
		minusstickchart.setAxisXColor(Color.WHITE);
		minusstickchart.setAxisYColor(Color.WHITE);
		minusstickchart.setLatitudeFontColor(Color.WHITE);
		minusstickchart.setLatitudeColor(Color.GRAY);
		minusstickchart.setLongitudeFontColor(Color.WHITE);
		minusstickchart.setLongitudeColor(Color.GRAY);
		// 最大纬线数
		minusstickchart.setLatitudeNum(3);
		// 最大经线数
		minusstickchart.setLongitudeNum(2);
		minusstickchart.setDisplayLongitudeTitle(true);
		minusstickchart.setDisplayLatitudeTitle(true);
		minusstickchart.setDisplayCrossXOnTouch(false);
		minusstickchart.setDisplayCrossYOnTouch(false);
		minusstickchart.setDisplayLatitude(true);
		minusstickchart.setDisplayLongitude(true);
		minusstickchart.setStickBorderColor(Color.WHITE);
		minusstickchart.setStickFillColor(Color.BLUE);

		minusstickchart.setDataQuadrantPaddingTop(5);
		minusstickchart.setDataQuadrantPaddingBottom(5);
		minusstickchart.setDataQuadrantPaddingLeft(5);
		minusstickchart.setDataQuadrantPaddingRight(5);
		minusstickchart.setAxisYTitleQuadrantWidth(50);
		minusstickchart.setAxisXTitleQuadrantHeight(20);
		minusstickchart.setAxisXPosition(GridChart.AXIS_X_POSITION_BOTTOM);
		minusstickchart.setAxisYPosition(GridChart.AXIS_Y_POSITION_RIGHT);

	}
}
