package com.tencent.supersonic.headless.server.persistence.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tencent.supersonic.headless.server.persistence.dataobject.QueryStatDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StatMapper extends BaseMapper<QueryStatDO> {
    @Select("SELECT id, trace_id, model_id, data_set_id, query_user, created_at, query_type, " +
            "query_type_back, query_sql_cmd, sql_cmd_md5 AS querySqlCmdMd5, query_struct_cmd, " +
            "struct_cmd_md5 AS queryStructCmdMd5, query_sql AS `sql`, sql_md5, query_engine, " +
            "elapsed_ms, query_state, native_query, start_date, end_date, dimensions, metrics, " +
            "select_cols, agg_cols, filter_cols, group_by_cols, order_by_cols, use_result_cache, " +
            "use_sql_cache, sql_cache_key, result_cache_key, query_opt_mode " +
            "FROM s2_query_stat_info")
    List<QueryStatDO> selectList();
}
