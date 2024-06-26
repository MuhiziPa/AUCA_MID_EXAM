package com.student.service;

import java.rmi.RemoteException;
import java.util.List;

import com.student.dao.SemesterDao;
import com.student.domain.Semester;

public class SemesterImpl implements SemesterInterface{
	private SemesterDao dao= new SemesterDao();

	@Override
	public void insertSemester(Semester semester) throws RemoteException {
		// TODO Auto-generated method stub
		dao.insertSemester(semester);
		
	}

	@Override
	public Semester selectSemester(int semesterId) throws RemoteException {
		// TODO Auto-generated method stub
		return dao.selectSemester(semesterId);
	}

	@Override
	public List<Semester> selectAllSemesters() throws RemoteException {
		// TODO Auto-generated method stub
		return dao.selectAllSemesters();
	}

	@Override
	public boolean deleteSemester(int id) throws RemoteException {
		// TODO Auto-generated method stub
		dao.deleteSemester(id);
		return true;
	}

	@Override
	public void updateSemester(Semester semester) throws RemoteException {
		// TODO Auto-generated method stub
		dao.updateSemester(semester);
		
	}

}
