# SOLID
- (S)ingle Responsibility Principle
- (O)pen-closed Principle
- (L)iskov Substitution Principle
- (I)nterface segregation Principle
- (D)ependency Inversion Principle

### 1-Single Responsibility Principle
- Single responsibility prensibi sınıfların iyi tanımlanmış tek bir sorumluluğu olması gerektiğini anlatmaktadır.

### 2-Open-Closed Principle
- Bir sınıf ya da fonksiyon var olan özellikleri korumalı yani davranışını değiştirmiyor olmalı ve yeni özellikler kazanabilmelidir.
- Sınıflarımız/fonksiyonlarımız değişikliğe kapalı ancak yeni davranışların eklenmesine açık olmalıdır.
- Open Sınıf için yeni davranışlar eklenebilmesini sağlar. Gereksinimler değiştiğinde, yeni gereksinimlerin karşılanabilmesi için bir sınıfa yeni veya farklı davranışlar eklenebilir olmasıdır.
- Closed Bir sınıf temel özelliklerinin değişimi ise mümkün olmamalıdır.
### 3-Liskov Substitution Principle
- Kodlarımızda herhangi bir değişiklik yapmaya gerek duymadan alt sınıfları, türedikleri(üst) sınıfların yerine kullanabilmeliyiz.
- Türeyen sınıf yani alt sınıflar ana(üst) sınıfın tüm özelliklerini ve metotlarını aynı işlevi gösterecek şekilde kullanabilme ve kendine ait yeni özellikler barındırabilmelidir.
### 4-Interface segregation Principle
- Sorumlulukların hepsini tek bir arayüze toplamak yerine daha özelleştirilmiş birden fazla arayüz oluşturmayı tercih etmemizi söyleyen prensiptir.
- Nesneler asla ihtiyacı olmayan property/metot vs içeren interfaceleri implement etmeye zorlanmamalıdır.
- Tek bir interface yerine kullanımlarına göre parçalanmış birden fazla interface ile işlemleri yürütmeliyiz
### 5-Dependency Inversion Principle
- Sınıflar arası bağımlılıklar olabildiğince az olmalıdır özellikle üst seviye sınıflar alt seviye sınıflara bağımlı olmamalıdır.
- Bir sınıfın, metodun ya da özelliğin, onu kullanan diğer sınıflara karşı olan bağımlılığı en aza indirgenmelidir. Bir alt sınıfta yapılan değişiklikler üst sınıfları etkilememelidir.
- Yüksek seviye sınıflarda bir davranış değiştiğinde, alt seviye davranışların bu değişime uyum sağlaması gerekir. Ancak, düşük seviye sınıflarda bir davranış değiştiğinde, üst seviye sınıfların davranışında bir bozulma meydana gelmemelidir.

### KAYNAKLAR
https://gokhana.medium.com/solid-nedir-solid-yaz%C4%B1l%C4%B1m-prensipleri-nelerdir-40fb9450408e
https://gokhana.medium.com/dependency-inversion-prensibi-nedir-kod-%C3%B6rne%C4%9Fiyle-soli%CC%87d-b61296523565
https://gokhana.medium.com/interface-segregation-prensibi-nedir-kod-%C3%B6rne%C4%9Fiyle-soli%CC%87d-ac0fd6812ecf
https://gokhana.medium.com/liskov-substitution-prensibi-nedir-kod-%C3%B6rne%C4%9Fiyle-soli%CC%87d-3cfc1cd63c1a
https://gokhana.medium.com/single-responsibility-prensibi-nedir-kod-%C3%B6rne%C4%9Fiyle-soli%CC%87d-c8b1602be602
