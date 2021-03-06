package com.genexus;

import java.sql.SQLException;

import com.genexus.ModelContext;

public interface ISubmitteable
{
	public void submit(int submitId, Object []submitParms, ModelContext ctx);
	public void submit(int submitId, Object []submitParms);
	public void submitReorg(int submitId, Object []submitParms) throws SQLException;
}
