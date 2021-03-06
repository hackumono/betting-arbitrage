package com.isfootball.jdbc.rep.db;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import com.nurkiewicz.jdbcrepository.RowUnmapper;
import com.isfootball.jdbc.BetTypes;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
public class BetTypesDB
{

	private static String TABLE_NAME = "BET_TYPES";

	private static String TABLE_ALIAS = "bt";

	public static String getTableName()
	{
		return TABLE_NAME;
	}

	public static String getTableAlias()
	{
		return TABLE_NAME + " as " + TABLE_ALIAS;
	}

	public static String getAlias()
	{
		return TABLE_ALIAS;
	}

	public static String selectAllColumns(boolean ... useAlias)
	{
		return (useAlias[0] ? TABLE_ALIAS : TABLE_NAME) + ".*";
	}

	public enum COLUMNS
	{
		BET("bet"),
		BET_RUS("bet_rus"),
		;

		private String columnName;

		private COLUMNS (String columnName)
		{
			this.columnName = columnName;
		}

		public void setColumnName (String columnName)
		{
			this.columnName = columnName;
		}

		public String getColumnName ()
		{
			return this.columnName;
		}

		public String getColumnAlias ()
		{
			return TABLE_ALIAS + "." + this.columnName;
		}

		public String getColumnAliasAsName ()
		{
			return TABLE_ALIAS  + "." + this.columnName + " as " + TABLE_ALIAS + "_" + this.columnName;
		}

		public String getColumnAliasName ()
		{
			return TABLE_ALIAS + "_" + this.columnName;
		}

	}

	public BetTypesDB ()
	{

	}

	public static final RowMapper<BetTypes> ROW_MAPPER = new BetTypesRowMapper ();
	public static final class  BetTypesRowMapper implements RowMapper<BetTypes>
	{
		public BetTypes mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			BetTypes obj = new BetTypes();
			obj.setBet(rs.getString(COLUMNS.BET.getColumnName()));
			obj.setBetRus(rs.getString(COLUMNS.BET_RUS.getColumnName()));
			return obj;
		}
	}

	public static final RowUnmapper<BetTypes> ROW_UNMAPPER = new BetTypesRowUnmapper ();
	public static final class BetTypesRowUnmapper implements RowUnmapper<BetTypes>
	{
		public Map<String, Object> mapColumns(BetTypes bettypes)
		{
			Map<String, Object> mapping = new LinkedHashMap<String, Object>();
			mapping.put(COLUMNS.BET.getColumnName(), bettypes.getBet());
			mapping.put(COLUMNS.BET_RUS.getColumnName(), bettypes.getBetRus());
			return mapping;
		}
	}

	public static final RowMapper<BetTypes> ALIAS_ROW_MAPPER = new BetTypesAliasRowMapper ();
	public static final class  BetTypesAliasRowMapper implements RowMapper<BetTypes>
	{
		public BetTypes mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			BetTypes obj = new BetTypes();
			obj.setBet(rs.getString(COLUMNS.BET.getColumnAliasName()));
			obj.setBetRus(rs.getString(COLUMNS.BET_RUS.getColumnAliasName()));
			return obj;
		}
	}

	public static StringBuffer getAllColumnAliases ()
	{
		StringBuffer strBuf = new StringBuffer ();
		int i = COLUMNS.values ().length;
		for (COLUMNS c : COLUMNS.values ())
		{
			strBuf.append (c.getColumnAliasAsName ());
			if (--i > 0)
				strBuf.append (", ");
		}
		return strBuf;
	}

	/* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

}