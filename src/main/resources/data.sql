INSERT INTO Category (id, name, description) VALUES
    ( 1, 'Ciasta', 'Ciasta na cieplo' ),
    (2, 'Desery', 'Desery na zimno'),
    (3, 'Zupy', 'Zupy gotowane na miesie');

INSERT INTO Recipe (id, name, description, likes, url, category_id) VALUES
    (1, 'Sernik', 'twarog, biszkopty, truskawki, galaretka truskawkowa, zelatyna, mleko, śmietanka, cukier wanilinowy', 2, 'https://wszystkiegoslodkiego.pl/storage/images/201930/sernik-z-polewa-czekoladowa-1.jpg', 2 ),
    (2, 'Pomidorowa', 'Pomidory, woda', 4, 'https://s3.przepisy.pl/przepisy3ii/img/variants/800x0/zupa-pomidorowa.jpg', 3),
    (3, 'Szarlotka', '1,5 kg jablek, cukier, cukier wanilinowy, masło zimne, jajko, proszek do pieczenia', 1, 'https://d3iamf8ydd24h9.cloudfront.net/pictures/articles/2018/07/88438-v-900x556.jpg', 1),
    (4, 'Mus truskawkowy', 'Truskawki, smietanka kremowka, zelatyna, cukier puder, sok z limonki', 5, 'https://cdn.aniagotuje.com/pictures/articles/2020/05/4374232-v-1080x1080.jpg', 2);