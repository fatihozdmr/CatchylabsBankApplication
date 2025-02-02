Money Transfer Senaryolari
=====================
Created by fatih.ozdemir on 01/02/2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
TC_Account_001: My Account sayfasina gidilmesi
----------------
tags: myAccount, moneyTransfer, positive

* Catchylabs uygulamasina login ol
* Open Money Transfer butonuna tikla ve kontrol et
* Hesap bilgilerinin dogrulugunu kontrol et

TC_Account_002: Hesap Isminin Duzenlenmesi
---------------
tags: account,edit,positive

* Catchylabs uygulamasina login ol
* Open Money Transfer butonuna tikla ve kontrol et
* Edit Account butonuna tikla ve bilgilerin dogru listelendigi kontrol et
* Account name alanina "testt" textini gir ve girilen texti kaydet
* Update butonuna tikla ve My account sayfasinin goruntulendigi kontrol et
* Duzenlenen account name kontrol et

TC_Account_003: Hesaba Basarili Para Transferi Yapilmasi
----------------
Tags: account,moneyTransfer,positive
* Catchylabs uygulamasina login ol
* Open Money Transfer butonuna tikla ve kontrol et
* Transfer Money butonuna tikla ve bilgilerin dogru sekilde goruntulendigini kontrol et
* Amount alanina "500" gir ve girilen tutari kaydet
* Send butonuna tikla ve My accout sayfasinin goruntulendigi kontrol et
* Transactions listesinden gonderilen transfer tutarini kontrol et

TC_Account_004: Kart Ile Hesaba Para Yatirma Islemi
----------------
Tags: account,addMoney,positive
* Catchylabs uygulamasina login ol
* Open Money Transfer butonuna tikla ve kontrol et
* Add Money butonuna tikla ve bilgilerin dogru sekilde listelendigi kontrol et
* Kredi karti bilgilerini gir
* Add butonuna tikla ve My accout sayfasinin goruntulendigi kontrol et
* Transactions listesinden hesaba eklenen tutari kontrol et