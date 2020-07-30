# J2Cube 

### 通过前端配置信息获取数据库中不可知数据结构的后端SDK和API。

```$json
{
    "dimensions": [
        {
            "field": "维度表名.属性名称",
            "rule": "去空格、替换值、加前缀、"
        }
    ],
    "timeDimensions": [
        {
            "dimension": "时间维度表名.属性名",
            "granularity": "粒度 例如 年、月、日、周、天、时、分、秒", 
            "dateRange": "时间范围",
            "format": "如果为null 则为不处理，可选择 yyyy  MM dd HH mm ss 所有组合"
        }
    ],
    "measures": [
        {
            "field": "量度表名.属性名",
            "type": "聚类类型  none 不聚合 count 统计 sum 求和 avg 平均数 等等"
        }
    ],
    "filters": [
        {
            "name": "过滤条件表名.属性名",
            "expression": "表达式 == < > <= >= in not in like",
            "value": ""
        }
    ],
    "limit": 10,
    "offset": 1,
    "order": {
        "排序表名.属性名": "排序方式 正序 asc  逆序 desc"
    },
    "timezone": "时区"
}

```