create table tb_currency(
	id SERIAL PRIMARY key,
	source_currency CHAR(3) NOT NULL,
	target_currency CHAR(3) NOT NULL,
	conversion_rate DECIMAL(10,2) NOT NULL
);