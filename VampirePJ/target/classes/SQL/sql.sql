CREATE TABLE `user` (
   `user_id`   varchar(100)   ,
   `pwd`   varchar(100)   NOT NULL,
   `name`   varchar(100)   NOT NULL,
   `age`   int   NOT NULL,
   `gender`   varchar(100)   NOT NULL,
    PRIMARY KEY (`user_id`)
);

CREATE TABLE `bloodpressure` (
   `bp_id`   int   PRIMARY KEY AUTO_INCREMENT,
   `sys`   int   NOT NULL,
   `dia`   int   NOT NULL,
   `p`   int   NOT NULL,
   `checktime`   date   DEFAULT now(),
   `user_id`   varchar(100)   NOT NULL,
    FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE
);

