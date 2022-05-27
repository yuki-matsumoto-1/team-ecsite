SET foreign_key_checks=1;

USE knightsdb;

INSERT INTO mst_user(user_name,password,family_name,first_name,family_name_kana,first_name_kana,gender) VALUES ('yamada@gmail.com','123','山田','太郎','やまだ','たろう',0);


INSERT INTO mst_category (id, category_name, category_description) VALUES
(1, '哺乳類', '哺乳類に属する生物'),
(2, '魚類', '魚類に属する生物'),
(3, '鳥類', '鳥類に属する生物');


INSERT INTO mst_product (id, product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) VALUES
(1, 'キリン', 'きりん', '高血圧', 1, 10000, '/img/Giraffe.jpeg', '1907/03/18', '株式会社麒麟'),
(2, 'イノシシ', 'いのしし', '野生の豚', 1, 10000, '/img/Boar.jpeg', '2000/01/02', '株式会社猪'),
(3, 'ネコ', 'ねこ', '古代エジプトでは神', 1, 10000, '/img/Cat.jpeg', '2000/01/01', '株式会社猫'),
(4, 'イヌ', 'いぬ', '古くからペット', 1, 10000, '/img/Dog.jpeg', '2000/01/01', '株式会社犬'),
(5, '金魚', 'きんぎょ', '意外と長生き', 2, 10000, '/img/Goldfish.jpeg', '2000/01/01', '株式会社金魚'),
(6, 'グッピー', 'ぐっぴー', '温度差で死ぬ', 2, 10000, '/img/Guppy.jpeg', '2000/01/01', '株式会社グッピー'),
(7, 'フクロウ', 'ふくろう', '夜の狩人', 3, 10000, '/img/Owl.jpeg', '2000/01/01', '株式会社梟'),
(8, 'インコ', 'いんこ', '鸚鵡との違いがわからん', 3, 10000, '/img/Parakeet.jpeg', '2000/01/01', '株式会社鸚哥'),
(9, 'ペンギン', 'ぺんぎん', '意外と足長', 3, 10000, '/img/Penguin.jpeg', '2000/01/01', '株式会社人鳥'),
(10, 'サメ', 'さめ', 'クソ映画といえば', 2, 10000, '/img/Shark.jpeg', '2000/01/01', '株式会社鮫');

テスト用データ↓
INSERT INTO mst_category (id, category_name, category_description) VALUES
(1, '哺乳類', '哺乳類に属する生物'),
(2, '魚類', '魚類に属する生物');

INSERT INTO mst_product (product_name, product_name_kana, product_description, category_id, price, image_full_path, release_date, release_company) VALUES
('キリン', 'きりん', '高血圧', 1, 10000, '/img/Giraffe.jpeg', '1907/03/18', '株式会社麒麟'),
('イノシシ', 'いのしし', '野生の豚', 1, 10000, '/img/Boar.jpeg', '2000/01/02', '株式会社猪'),
('金魚', 'きんぎょ', '意外と長生き', 2, 10000, '/img/Goldfish.jpeg', '2000/01/01', '株式会社金魚'),
('でかいキリン', 'でかいきりん', 'キリンよりでかい', 1, 20000, '/img/B_Giraffe.jpeg', '1907/03/19', '株式会社大麒麟');
