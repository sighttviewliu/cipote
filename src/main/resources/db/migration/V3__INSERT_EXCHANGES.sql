INSERT INTO EXCHANGE (NAME) VALUES('GDAX');
INSERT INTO EXCHANGE (NAME) VALUES('BINANCE');
INSERT INTO EXCHANGE (NAME) VALUES('BITTREX');


INSERT INTO EXCHANGE_API (ID_EXCHANGE, API_URL) VALUES((SELECT ID FROM EXCHANGE WHERE NAME = 'GDAX'), 'https://api.gdax.com/products/{0}-{1}/ticker');
INSERT INTO EXCHANGE_API (ID_EXCHANGE, API_URL) VALUES((SELECT ID FROM EXCHANGE WHERE NAME = 'BINANCE'), 'https://api.binance.com/api/v1/ticker/price?symbol={0}{1}');
INSERT INTO EXCHANGE_API (ID_EXCHANGE, API_URL) VALUES((SELECT ID FROM EXCHANGE WHERE NAME = 'BITTREX'), 'https://bittrex.com/api/v1.1/public/getticker?market={1}-{0}');
