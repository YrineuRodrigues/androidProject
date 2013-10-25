package br.com.mobile.scrum.activity;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.SimpleCursorAdapter;
import br.com.mobile.scrum.domain.Project;

public class ProjectsActivity extends Activity{

	private SimpleCursorAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		List<Project> listProject = getListProjects();
		final String[] projectsRow = new String[]{};
		for(int i=0; i<listProject.size(); i++){
			projectsRow[i]= listProject.get(i).getDescription();
		}
				
		
	}
	
	private List<Project> getListProjects(){
		//Código que captura os projetos do servidor
		
		List<Project> projectList = new ArrayList<Project>();
		projectList.add(new Project("Projeto 01", Calendar.getInstance()));
		projectList.add(new Project("Projeto 02", Calendar.getInstance()));
		return projectList;
	}
}
