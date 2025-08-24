package com.crudoperation.service;

import java.util.List;

import com.crudoperation.entity.IplTeam;

public interface IplService {
public IplTeam inserdata(IplTeam iplTeam);
public List<IplTeam>getAllTeams();
public IplTeam updateTeam(int id,IplTeam iplTeam);
public void delete(int id);


}
