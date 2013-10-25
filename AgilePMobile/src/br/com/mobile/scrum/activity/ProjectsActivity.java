package br.com.mobile.scrum.activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import br.com.mobile.scrum.domain.Project;

public class ProjectsActivity extends ListActivity {

	private ArrayAdapter<String> adapter;
	private Object myActionMode;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		List<Project> listProject = getListProjects();
		final List<String> projectsRow = new ArrayList<String>();
		for (int i = 0; i < listProject.size(); i++) {
			projectsRow.add(listProject.get(i).getDescription());
		}

		adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_expandable_list_item_1,
				(String[]) listProject.toArray());

		setListAdapter(adapter);
		
		
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
	}

	private List<Project> getListProjects() {
		// Código que captura os projetos do servidor

		List<Project> projectList = new ArrayList<Project>();
		projectList.add(new Project("Projeto 01", Calendar.getInstance()));
		projectList.add(new Project("Projeto 02", Calendar.getInstance()));
		return projectList;
	}
}
