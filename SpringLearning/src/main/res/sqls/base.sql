

CREATE TABLE IF NOT EXISTS `employee` (
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(10) NOT NULL,
    `sex` enum('male','female') not null default 'male',
    `age` int(3) unsigned not null default 28,
    `hire_date` date not null,
    `post` varchar(50),
    `post_comment` varchar(100),
    `salary` double(15,2),
    `office` int,
    `depart_id` int,
    PRIMARY KEY `pk_id`(`id`)
) ENGINE = InnoDB;

insert into employee(name,sex,age,hire_date,post,salary,office,depart_id) values
    ('egon','male',18,'20170301','我司驻沙河办事处外交大使',7300.33,401,1),
    ('alex','male',78,'20150302','teacher',1000000.31,401,1),
    ('wupeiqi','male',81,'20130305','teacher',8300,401,1),
    ('yuanhao','male',73,'20140701','teacher',3500,401,1),
    ('liwenzhou','male',28,'20121101','teacher',2100,401,1),
    ('jingliyang','female',18,'20110211','teacher',9000,401,1),
    ('jinxin','male',18,'19000301','teacher',30000,401,1),
    ('成龙','male',48,'20101111','teacher',10000,401,1),
    ('歪歪','female',48,'20150311','sale',3000.13,402,2),
    ('丫丫','female',38,'20101101','sale',2000.35,402,2),
    ('丁丁','female',18,'20110312','sale',1000.37,402,2),
    ('星星','female',18,'20160513','sale',3000.29,402,2),
    ('格格','female',28,'20170127','sale',4000.33,402,2),
    ('张野','male',28,'20160311','operation',10000.13,403,3),
    ('程咬金','male',18,'19970312','operation',20000,403,3),
    ('程咬银','female',18,'20130311','operation',19000,403,3),
    ('程咬铜','male',18,'20150411','operation',18000,403,3),
    ('程咬铁','female',18,'20140512','operation',17000,403,3)
;


