package cn.limc.androidcharts;

import java.util.ArrayList;
import java.util.List;

import cn.limc.androidcharts.entity.TitleValueColorEntity;
import cn.limc.androidcharts.view.PieChart;
import android.app.Activity;
import android.os.Bundle;
//饼图
public class PieChartActivity extends Activity {
	PieChart piechart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pie_chart_layout);
		initPieChart();
	}
	private void initPieChart() {
		this.piechart = (PieChart) findViewById(R.id.piechart);
		List<TitleValueColorEntity> data3 = new ArrayList<TitleValueColorEntity>();
		data3.add(new TitleValueColorEntity(getResources().getString(
				R.string.piechart_title1), 2, getResources().getColor(
				R.drawable.red)));
		data3.add(new TitleValueColorEntity(getResources().getString(
				R.string.piechart_title2), 3, getResources().getColor(
				R.drawable.orange)));
		data3.add(new TitleValueColorEntity(getResources().getString(
				R.string.piechart_title3), 6, getResources().getColor(
				R.drawable.yellow)));
		data3.add(new TitleValueColorEntity(getResources().getString(
				R.string.piechart_title4), 2, getResources().getColor(
				R.drawable.lightgreen)));
		data3.add(new TitleValueColorEntity(getResources().getString(
				R.string.piechart_title5), 2, getResources().getColor(
				R.drawable.green)));
		piechart.setData(data3);
	}
}
