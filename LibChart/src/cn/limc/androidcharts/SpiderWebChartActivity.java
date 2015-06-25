package cn.limc.androidcharts;

import java.util.ArrayList;
import java.util.List;

import cn.limc.androidcharts.entity.TitleValueEntity;
import cn.limc.androidcharts.view.SpiderWebChart;
import android.app.Activity;
import android.os.Bundle;

public class SpiderWebChartActivity extends Activity {
	SpiderWebChart spiderwebchart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spider_web_chart_layout);
		initSpiderWebChart();
	}
	private void initSpiderWebChart() {
		this.spiderwebchart = (SpiderWebChart) findViewById(R.id.spiderwebchart);

		List<TitleValueEntity> data1 = new ArrayList<TitleValueEntity>();
		data1.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title1), 3));
		data1.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title2), 4));
		data1.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title3), 9));
		data1.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title4), 8));
		data1.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title5), 10));

		List<TitleValueEntity> data2 = new ArrayList<TitleValueEntity>();
		data2.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title5), 3));
		data2.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title5), 4));
		data2.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title5), 5));
		data2.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title5), 6));
		data2.add(new TitleValueEntity(getResources().getString(
				R.string.spiderwebchart_title5), 7));

		List<List<TitleValueEntity>> data = new ArrayList<List<TitleValueEntity>>();
		data.add(data1);
		data.add(data2);

		spiderwebchart.setData(data);
		spiderwebchart.setLatitudeNum(5);
	}
}
