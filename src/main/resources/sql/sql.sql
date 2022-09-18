CREATE TABLE `user` (
                        `id` bigint NOT NULL COMMENT '主键ID',
                        `id_type` varchar(2) DEFAULT NULL COMMENT '证件类型',
                        `id_num` varchar(50) DEFAULT NULL COMMENT '证件号',
                        `user_name` varchar(100) DEFAULT NULL COMMENT '用户姓名',
                        `address` varchar(100) DEFAULT NULL COMMENT '地址',
                        `login_phone` varchar(20) DEFAULT NULL COMMENT '登录手机号',
                        `password` varchar(500) DEFAULT NULL COMMENT '登录密码',
                        `deleted` bit(1) DEFAULT b'0' COMMENT '逻辑删除：0-未删除，1-已删除',
                        `create_date` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间，默认当前时间',
                        `pubts` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '时间戳'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci