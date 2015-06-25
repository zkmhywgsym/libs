package cn.limc.androidcharts;

import java.util.ArrayList;
import java.util.List;

import cn.limc.androidcharts.entity.DateValueEntity;
import cn.limc.androidcharts.entity.IStickEntity;
import cn.limc.androidcharts.entity.LineEntity;
import cn.limc.androidcharts.entity.ListChartData;
import cn.limc.androidcharts.entity.StickEntity;
import cn.limc.androidcharts.view.GridChart;
import cn.limc.androidcharts.view.MAStickChart;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
//ma+柱图
public class MaStrickChartActivity extends Activity {
	MAStickChart mastickchart;
	List<IStickEntity> vol;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ma_strick_chart_layout);
		initVOL();
		initMAStickChart();
	}
	
	private void initMAStickChart() {
		this.mastickchart = (MAStickChart) findViewById(R.id.mastickchart);

		// 以下计算VOL
		List<LineEntity<DateValueEntity>> vlines = new ArrayList<LineEntity<DateValueEntity>>();

		// 计算5日均线
		LineEntity<DateValueEntity> VMA5 = new LineEntity<DateValueEntity>();
		VMA5.setTitle("MA5");
		VMA5.setLineColor(Color.WHITE);
		VMA5.setLineData(initVMA(5));
		vlines.add(VMA5);

		// 计算10日均线
		LineEntity<DateValueEntity> VMA10 = new LineEntity<DateValueEntity>();
		VMA10.setTitle("MA10");
		VMA10.setLineColor(Color.RED);
		VMA10.setLineData(initVMA(10));
		vlines.add(VMA10);

		// 计算25日均线
		LineEntity<DateValueEntity> VMA25 = new LineEntity<DateValueEntity>();
		VMA25.setTitle("MA25");
		VMA25.setLineColor(Color.GREEN);
		VMA25.setLineData(initVMA(25));
		vlines.add(VMA25);

		mastickchart.setAxisXColor(Color.LTGRAY);
		mastickchart.setAxisYColor(Color.LTGRAY);
		mastickchart.setLatitudeColor(Color.GRAY);
		mastickchart.setLongitudeColor(Color.GRAY);
		mastickchart.setBorderColor(Color.LTGRAY);
		mastickchart.setLongitudeFontColor(Color.WHITE);
		mastickchart.setLatitudeFontColor(Color.WHITE);
		mastickchart.setStickFillColor(getResources().getColor(
				R.drawable.yellow));

		// 最大显示足数
		mastickchart.setMaxSticksNum(52);
		// 最大纬线数
		mastickchart.setLatitudeNum(2);
		// 最大经线数
		mastickchart.setLongitudeNum(3);
		// 最大价格
		mastickchart.setMaxValue(10000);
		// 最小价格
		mastickchart.setMinValue(100);

		mastickchart.setDisplayLongitudeTitle(true);
		mastickchart.setDisplayLatitudeTitle(true);
		mastickchart.setDisplayLatitude(true);
		mastickchart.setDisplayLongitude(true);
		mastickchart.setBackgroundColor(Color.BLACK);

		mastickchart.setDataQuadrantPaddingTop(5);
		mastickchart.setDataQuadrantPaddingBottom(5);
		mastickchart.setDataQuadrantPaddingLeft(5);
		mastickchart.setDataQuadrantPaddingRight(5);
		mastickchart.setAxisYTitleQuadrantWidth(50);
		mastickchart.setAxisXTitleQuadrantHeight(20);
		mastickchart.setAxisXPosition(GridChart.AXIS_X_POSITION_BOTTOM);
		mastickchart.setAxisYPosition(GridChart.AXIS_Y_POSITION_RIGHT);

		// 为chart1增加均线
		mastickchart.setLinesData(vlines);
		// 为chart1增加均线
		mastickchart.setStickData(new ListChartData<IStickEntity>(vol));

	}
	/**初始化柱状图值*/
	private void initVOL() {
		List<IStickEntity> stick = new ArrayList<IStickEntity>();

		stick.add(new StickEntity(406000, 0, 20110825));
		stick.add(new StickEntity(232000, 0, 20110824));
		stick.add(new StickEntity(355000, 0, 20110823));
		stick.add(new StickEntity(437000, 0, 20110822));
		stick.add(new StickEntity(460000, 0, 20110819));
		stick.add(new StickEntity(422000, 0, 20110818));
		stick.add(new StickEntity(502000, 0, 20110817));
		stick.add(new StickEntity(509000, 0, 20110816));
		stick.add(new StickEntity(110000, 0, 20110815));
		stick.add(new StickEntity(110000, 0, 20110812));
		stick.add(new StickEntity(310000, 0, 20110811));
		stick.add(new StickEntity(210000, 0, 20110810));
		stick.add(new StickEntity(211000, 0, 20110809));
		stick.add(new StickEntity(577000, 0, 20110808));
		stick.add(new StickEntity(493000, 0, 20110805));
		stick.add(new StickEntity(433000, 0, 20110804));
		stick.add(new StickEntity(479000, 0, 20110803));
		stick.add(new StickEntity(360000, 0, 20110802));
		stick.add(new StickEntity(437000, 0, 20110801));
		stick.add(new StickEntity(504000, 0, 20110729));
		stick.add(new StickEntity(520000, 0, 20110728));
		stick.add(new StickEntity(494000, 0, 20110727));
		stick.add(new StickEntity(312000, 0, 20110726));
		stick.add(new StickEntity(424000, 0, 20110725));
		stick.add(new StickEntity(557000, 0, 20110722));
		stick.add(new StickEntity(596000, 0, 20110721));
		stick.add(new StickEntity(311000, 0, 20110720));
		stick.add(new StickEntity(312000, 0, 20110719));
		stick.add(new StickEntity(312000, 0, 20110718));
		stick.add(new StickEntity(312000, 0, 20110715));
		stick.add(new StickEntity(410000, 0, 20110714));
		stick.add(new StickEntity(311000, 0, 20110713));
		stick.add(new StickEntity(210000, 0, 20110712));
		stick.add(new StickEntity(410000, 0, 20110711));
		stick.add(new StickEntity(214000, 0, 20110708));
		stick.add(new StickEntity(312000, 0, 20110707));
		stick.add(new StickEntity(212000, 0, 20110706));
		stick.add(new StickEntity(414000, 0, 20110705));
		stick.add(new StickEntity(310000, 0, 20110704));
		stick.add(new StickEntity(210000, 0, 20110701));
		stick.add(new StickEntity(190000, 0, 20110630));
		stick.add(new StickEntity(210000, 0, 20110629));
		stick.add(new StickEntity(116000, 0, 20110628));
		stick.add(new StickEntity(142000, 0, 20110627));
		stick.add(new StickEntity(524000, 0, 20110624));
		stick.add(new StickEntity(246000, 0, 20110623));
		stick.add(new StickEntity(432000, 0, 20110622));
		stick.add(new StickEntity(352000, 0, 20110621));
		stick.add(new StickEntity(243000, 0, 20110620));
		stick.add(new StickEntity(165000, 0, 20110617));
		stick.add(new StickEntity(554000, 0, 20110616));
		stick.add(new StickEntity(552000, 0, 20110615));
		stick.add(new StickEntity(431000, 0, 20110614));
		stick.add(new StickEntity(317000, 0, 20110613));
		stick.add(new StickEntity(512000, 0, 20110610));
		stick.add(new StickEntity(283000, 0, 20110609));
		stick.add(new StickEntity(144000, 0, 20110608));
		stick.add(new StickEntity(273000, 0, 20110607));
		stick.add(new StickEntity(278000, 0, 20110603));
		stick.add(new StickEntity(624000, 0, 20110602));
		stick.add(new StickEntity(217000, 0, 20110601));
		stick.add(new StickEntity(116000, 0, 20110531));
		stick.add(new StickEntity(191000, 0, 20110530));
		stick.add(new StickEntity(204000, 0, 20110527));
		stick.add(new StickEntity(236000, 0, 20110526));
		stick.add(new StickEntity(421000, 0, 20110525));
		stick.add(new StickEntity(114000, 0, 20110524));
		stick.add(new StickEntity(403000, 0, 20110523));
		stick.add(new StickEntity(205000, 0, 20110520));
		stick.add(new StickEntity(328000, 0, 20110519));
		stick.add(new StickEntity(109000, 0, 20110518));
		stick.add(new StickEntity(286000, 0, 20110517));
		stick.add(new StickEntity(103000, 0, 20110516));
		stick.add(new StickEntity(114000, 0, 20110513));
		stick.add(new StickEntity(107000, 0, 20110512));
		stick.add(new StickEntity(106000, 0, 20110511));
		stick.add(new StickEntity(146000, 0, 20110510));
		stick.add(new StickEntity(105000, 0, 20110509));
		stick.add(new StickEntity(312000, 0, 20110506));
		stick.add(new StickEntity(530000, 0, 20110505));
		stick.add(new StickEntity(275000, 0, 20110504));
		stick.add(new StickEntity(432000, 0, 20110503));

		this.vol = new ArrayList<IStickEntity>();
		for (int i = stick.size(); i > 0; i--) {
			this.vol.add(stick.get(i - 1));
		}

	}
	private List<DateValueEntity> initVMA(int days) {
		if (days < 2) {
			return null;
		}

		List<DateValueEntity> MA5Values = new ArrayList<DateValueEntity>();

		float sum = 0;
		float avg = 0;
		for (int i = 0; i < this.vol.size(); i++) {
			float close = (float) vol.get(i).getHigh();
			if (i < days) {
				sum = sum + close;
				avg = sum / (i + 1f);
			} else {
				sum = sum + close - (float) vol.get(i - days).getHigh();
				avg = sum / days;
			}
			MA5Values.add(new DateValueEntity(avg, vol.get(i).getDate()));
		}

		return MA5Values;
	}
}
