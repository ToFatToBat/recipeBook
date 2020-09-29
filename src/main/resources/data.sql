INSERT INTO Category (id, name, description) VALUES
    ( 1, 'Ciasta', 'Ciasta na cieplo' ),
    (2, 'Desery', 'Desery na zimno'),
    (3, 'Zupy', 'Zupy gotowane na miesie');

INSERT INTO Recipe (id, name, description, likes, url, category_id) VALUES
    (1, 'Sernik', 'twarog, biszkopty, truskawki, galaretka truskawkowa, zelatyna, mleko, śmietanka, cukier wanilinowy', 2, 'https://wszystkiegoslodkiego.pl/storage/images/201930/sernik-z-polewa-czekoladowa-1.jpg', 2 ),
    (2, 'Pomidorowa', 'Pomidory, woda', 4, 'https://s3.przepisy.pl/przepisy3ii/img/variants/800x0/zupa-pomidorowa.jpg', 3);
    ()