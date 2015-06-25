package cn.limc.androidcharts;

import java.util.ArrayList;
import java.util.List;

import cn.limc.androidcharts.entity.ColoredStickEntity;
import cn.limc.androidcharts.entity.IStickEntity;
import cn.limc.androidcharts.entity.ListChartData;
import cn.limc.androidcharts.view.ColoredSlipStickChart;
import cn.limc.androidcharts.view.GridChart;
import cn.limc.androidcharts.view.IZoomable;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
//颜色柱图
public class ColorSlipStrickChartActivity extends Activity {
	ColoredSlipStickChart coloredslipstickchart;
	List<IStickEntity> volc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.colored_slip_stick_chart_layout);
		initVOLC();
		initColoredSlipStickChart();
	}
	private void initColoredSlipStickChart() {
		this.coloredslipstickchart = (ColoredSlipStickChart) findViewById(R.id.coloredslipstickchart);

		coloredslipstickchart.setAxisXColor(Color.LTGRAY);
		coloredslipstickchart.setAxisYColor(Color.LTGRAY);
		coloredslipstickchart.setLatitudeColor(Color.GRAY);
		coloredslipstickchart.setLongitudeColor(Color.GRAY);
		coloredslipstickchart.setBorderColor(Color.LTGRAY);
		coloredslipstickchart.setLongitudeFontColor(Color.WHITE);
		coloredslipstickchart.setLatitudeFontColor(Color.WHITE);

		// 最大纬线数
		coloredslipstickchart.setLatitudeNum(2);
		// 最大经线数
		coloredslipstickchart.setLongitudeNum(3);
		// 最大价格
		coloredslipstickchart.setMaxValue(600000);
		// 最小价格
		coloredslipstickchart.setMinValue(100);

		coloredslipstickchart.setDisplayFrom(10);

		coloredslipstickchart.setDisplayNumber(30);

		coloredslipstickchart.setMinDisplayNumber(5);

		coloredslipstickchart.setZoomBaseLine(IZoomable.ZOOM_BASE_LINE_CENTER);

		coloredslipstickchart.setDisplayLongitudeTitle(true);
		coloredslipstickchart.setDisplayLatitudeTitle(true);
		coloredslipstickchart.setDisplayLatitude(true);
		coloredslipstickchart.setDisplayLongitude(true);
		coloredslipstickchart.setBackgroundColor(Color.BLACK);

		coloredslipstickchart.setDataQuadrantPaddingTop(5);
		coloredslipstickchart.setDataQuadrantPaddingBottom(5);
		coloredslipstickchart.setDataQuadrantPaddingLeft(5);
		coloredslipstickchart.setDataQuadrantPaddingRight(5);
		coloredslipstickchart.setAxisYTitleQuadrantWidth(50);
		coloredslipstickchart.setAxisXTitleQuadrantHeight(20);
		coloredslipstickchart
				.setAxisXPosition(GridChart.AXIS_X_POSITION_BOTTOM);
		coloredslipstickchart.setAxisYPosition(GridChart.AXIS_Y_POSITION_RIGHT);

		// 为chart1增加均线
		coloredslipstickchart
				.setStickData(new ListChartData<IStickEntity>(volc));
	}
	/**初始化有色柱状图值*/
	private void initVOLC() {
		List<IStickEntity> stick = new ArrayList<IStickEntity>();
		this.volc = new ArrayList<IStickEntity>();

		stick.add(new ColoredStickEntity(406000, 0, 20110825, Color.RED));
		stick.add(new ColoredStickEntity(232000, 0, 20110824, Color.RED));
		stick.add(new ColoredStickEntity(355000, 0, 20110823, Color.BLUE));
		stick.add(new ColoredStickEntity(437000, 0, 20110822, Color.RED));
		stick.add(new ColoredStickEntity(460000, 0, 20110819, Color.BLUE));
		stick.add(new ColoredStickEntity(422000, 0, 20110818, Color.LTGRAY));
		stick.add(new ColoredStickEntity(502000, 0, 20110817, Color.RED));
		stick.add(new ColoredStickEntity(509000, 0, 20110816, Color.RED));
		stick.add(new ColoredStickEntity(110000, 0, 20110815, Color.RED));
		stick.add(new ColoredStickEntity(110000, 0, 20110812, Color.BLUE));
		stick.add(new ColoredStickEntity(310000, 0, 20110811, Color.RED));
		stick.add(new ColoredStickEntity(210000, 0, 20110810, Color.BLUE));
		stick.add(new ColoredStickEntity(211000, 0, 20110809, Color.BLUE));
		stick.add(new ColoredStickEntity(577000, 0, 20110808, Color.RED));
		stick.add(new ColoredStickEntity(493000, 0, 20110805, Color.BLUE));
		stick.add(new ColoredStickEntity(433000, 0, 20110804, Color.LTGRAY));
		stick.add(new ColoredStickEntity(479000, 0, 20110803, Color.BLUE));
		stick.add(new ColoredStickEntity(360000, 0, 20110802, Color.RED));
		stick.add(new ColoredStickEntity(437000, 0, 20110801, Color.BLUE));
		stick.add(new ColoredStickEntity(504000, 0, 20110729, Color.BLUE));
		stick.add(new ColoredStickEntity(520000, 0, 20110728, Color.BLUE));
		stick.add(new ColoredStickEntity(494000, 0, 20110727, Color.BLUE));
		stick.add(new ColoredStickEntity(312000, 0, 20110726, Color.RED));
		stick.add(new ColoredStickEntity(424000, 0, 20110725, Color.BLUE));
		stick.add(new ColoredStickEntity(557000, 0, 20110722, Color.RED));
		stick.add(new ColoredStickEntity(596000, 0, 20110721, Color.RED));
		stick.add(new ColoredStickEntity(311000, 0, 20110720, Color.LTGRAY));
		stick.add(new ColoredStickEntity(312000, 0, 20110719, Color.BLUE));
		stick.add(new ColoredStickEntity(312000, 0, 20110718, Color.RED));
		stick.add(new ColoredStickEntity(312000, 0, 20110715, Color.BLUE));
		stick.add(new ColoredStickEntity(410000, 0, 20110714, Color.BLUE));
		stick.add(new ColoredStickEntity(311000, 0, 20110713, Color.BLUE));
		stick.add(new ColoredStickEntity(210000, 0, 20110712, Color.BLUE));
		stick.add(new ColoredStickEntity(410000, 0, 20110711, Color.RED));
		stick.add(new ColoredStickEntity(214000, 0, 20110708, Color.RED));
		stick.add(new ColoredStickEntity(312000, 0, 20110707, Color.BLUE));
		stick.add(new ColoredStickEntity(212000, 0, 20110706, Color.RED));
		stick.add(new ColoredStickEntity(414000, 0, 20110705, Color.RED));
		stick.add(new ColoredStickEntity(310000, 0, 20110704, Color.BLUE));
		stick.add(new ColoredStickEntity(210000, 0, 20110701, Color.RED));
		stick.add(new ColoredStickEntity(190000, 0, 20110630, Color.RED));
		stick.add(new ColoredStickEntity(210000, 0, 20110629, Color.BLUE));
		stick.add(new ColoredStickEntity(116000, 0, 20110628, Color.BLUE));
		stick.add(new ColoredStickEntity(142000, 0, 20110627, Color.BLUE));
		stick.add(new ColoredStickEntity(524000, 0, 20110624, Color.RED));
		stick.add(new ColoredStickEntity(246000, 0, 20110623, Color.BLUE));
		stick.add(new ColoredStickEntity(432000, 0, 20110622, Color.RED));
		stick.add(new ColoredStickEntity(352000, 0, 20110621, Color.RED));
		stick.add(new ColoredStickEntity(243000, 0, 20110620, Color.RED));
		stick.add(new ColoredStickEntity(165000, 0, 20110617, Color.BLUE));
		stick.add(new ColoredStickEntity(554000, 0, 20110616, Color.BLUE));
		stick.add(new ColoredStickEntity(552000, 0, 20110615, Color.BLUE));
		stick.add(new ColoredStickEntity(431000, 0, 20110614, Color.LTGRAY));
		stick.add(new ColoredStickEntity(317000, 0, 20110613, Color.BLUE));
		stick.add(new ColoredStickEntity(512000, 0, 20110610, Color.BLUE));
		stick.add(new ColoredStickEntity(283000, 0, 20110609, Color.RED));
		stick.add(new ColoredStickEntity(144000, 0, 20110608, Color.RED));
		stick.add(new ColoredStickEntity(273000, 0, 20110607, Color.RED));
		stick.add(new ColoredStickEntity(278000, 0, 20110603, Color.RED));
		stick.add(new ColoredStickEntity(624000, 0, 20110602, Color.RED));
		stick.add(new ColoredStickEntity(217000, 0, 20110601, Color.BLUE));
		stick.add(new ColoredStickEntity(116000, 0, 20110531, Color.BLUE));
		stick.add(new ColoredStickEntity(191000, 0, 20110530, Color.RED));
		stick.add(new ColoredStickEntity(204000, 0, 20110527, Color.BLUE));
		stick.add(new ColoredStickEntity(236000, 0, 20110526, Color.BLUE));
		stick.add(new ColoredStickEntity(421000, 0, 20110525, Color.LTGRAY));
		stick.add(new ColoredStickEntity(114000, 0, 20110524, Color.BLUE));
		stick.add(new ColoredStickEntity(403000, 0, 20110523, Color.RED));
		stick.add(new ColoredStickEntity(205000, 0, 20110520, Color.RED));
		stick.add(new ColoredStickEntity(328000, 0, 20110519, Color.BLUE));
		stick.add(new ColoredStickEntity(109000, 0, 20110518, Color.RED));
		stick.add(new ColoredStickEntity(286000, 0, 20110517, Color.RED));
		stick.add(new ColoredStickEntity(103000, 0, 20110516, Color.BLUE));
		stick.add(new ColoredStickEntity(114000, 0, 20110513, Color.BLUE));
		stick.add(new ColoredStickEntity(107000, 0, 20110512, Color.RED));
		stick.add(new ColoredStickEntity(106000, 0, 20110511, Color.BLUE));
		stick.add(new ColoredStickEntity(146000, 0, 20110510, Color.LTGRAY));
		stick.add(new ColoredStickEntity(105000, 0, 20110509, Color.RED));
		stick.add(new ColoredStickEntity(312000, 0, 20110506, Color.RED));
		stick.add(new ColoredStickEntity(530000, 0, 20110505, Color.RED));
		stick.add(new ColoredStickEntity(275000, 0, 20110504, Color.BLUE));
		stick.add(new ColoredStickEntity(432000, 0, 20110503, Color.BLUE));

		for (int i = stick.size(); i > 0; i--) {
			this.volc.add(stick.get(i - 1));
		}
	}
}
