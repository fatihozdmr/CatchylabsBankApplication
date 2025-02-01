Login Senaryolari
=====================
tags:login
Created by fatih.ozdemir on 31/01/2025

This is an executable specification file which follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.
     
TC_Login_001: Gecerli Kullanici Adi ve Sifre Ile Login Olma
-----------------------------------------------------------
tags: validLogin, positive

* Catchylabs sayfasina git
* "fatih.ozdemir" kullanici adini username alanina yaz
* "ozdemir1907." sifresini password alanina yaz
* Login butonuna tikla
* Basarili giris yapildigini kontrol et

TC_Login_002: Gecersiz Kullanici Adi ve Sifre Ile Login Olma
------------------------------------------------------------
tags: invalidLogin, negative

* Catchylabs sayfasina git
* "gecersiz" kullanici adini username alanina yaz
* "xyz1234." sifresini password alanina yaz
* Login butonuna tikla
* Hatali giris uyari mesaji goruntulenir

TC_Login_003: Uygulamadan Cikis Yapma
-------------------------------------
tags: logout, positive

* Catchylabs uygulamasina login ol
* Open Money Transfer butonuna tikla ve kontrol et
* Geri git butonuna tikla
* Logout butonuna tikla