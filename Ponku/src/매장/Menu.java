package 매장;

import 공통.AppIO;

public class Menu {

   private int _size;

   // 커피,음료,사이드,시즌
   private Product[] _coffeeMenu;// 아메리카노 등
   private Product[] _drinkMenu;
   private Product[] _sideMenu;
   private Product[] _seasonMenu;

   public int getSize() {
      return _size;
   }

   private void setSize(int size) {
      this._size = size;
   }

   public Product[] coffeeMenu() {
      return this._coffeeMenu;
   }

   private void setCoffeeMenu(Product[] aMenu) {
      this._coffeeMenu = aMenu;
   }

   public Product[] drinkMenu() {
      return this._drinkMenu;
   }

   private void setDrinkMenu(Product[] aMenu) {
      this._drinkMenu = aMenu;
   }

   public Product[] sideMenu() {
      return this._sideMenu;
   }

   private void setSideMenu(Product[] aMenu) {
      this._sideMenu = aMenu;
   }

   public Product[] seasonMenu() {
      return this._seasonMenu;
   }

   private void setSeasonMenu(Product[] aMenu) {
      this._seasonMenu = aMenu;
   }

   public Menu() {

      this.setSize(0);
      this.setCoffeeMenu(new Product[15]);
      this.setDrinkMenu(new Product[15]);
      this.setSideMenu(new Product[15]);
      this.setSeasonMenu(new Product[15]);

      //this.fixedAllMenu();

   }

   public void MenuBoard() {   // 메뉴판 출력 메소드
      int c, d, s;
      AppIO.outputLine("\n[PONKU] 메뉴판을 출력합니다.");
      AppIO.outputLine(
            "\n      <<   Coffee   >>                <<   Drink   >>                  <<   Side   >>                 <<   Season   >>");
      AppIO.outputLine(
            "          이름                         가격                         이름                           가격                          이름                          가격                          이름                          가격");
      for (int i = 0; i < this.seasonMenu().length - 1 && this._seasonMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost())
               + String.format("   %10s   %8s", this.drinkMenu()[i].name(), this.drinkMenu()[i].cost())
               + String.format("   %10s   %8s", this.sideMenu()[i].name(), this.sideMenu()[i].cost())
               + String.format("   %10s   %8s", this.seasonMenu()[i].name(), this.seasonMenu()[i].cost()));
      }
      for (s = 0; this._seasonMenu[s] != null; s++) {
      }

      for (int i = s; i < this.sideMenu().length - 1 && this._sideMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost())
               + String.format("   %10s   %8s", this.drinkMenu()[i].name(), this.drinkMenu()[i].cost())
               + String.format("   %10s   %8s", this.sideMenu()[i].name(), this.sideMenu()[i].cost()));
      }
      for (d = 0; this._sideMenu[d] != null; d++) {
      }

      for (int i = d; i < this.drinkMenu().length - 1 && this._drinkMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost())
               + String.format("   %10s   %8s", this.drinkMenu()[i].name(), this.drinkMenu()[i].cost()));
      }
      for (c = 0; this._drinkMenu[c] != null; c++) {
      }

      for (int i = c; i < this.coffeeMenu().length - 1 && this._coffeeMenu[i] != null; i++) {
         AppIO.outputLine(String.format("%10s   %8s", this.coffeeMenu()[i].name(), this.coffeeMenu()[i].cost()));
      }
      AppIO.outputLine("");
   }

   public void fixedCoffeeMenu() {

      Product Espresso = new Product("에스프레소", 1500, "Coffee");

      Product HotAmericano = new Product("아메리카노(H)", 2000, "Coffee");
      Product IcedAmericano = new Product("아메리카노(C)", 2000, "Coffee");

      Product HotCaffeLatte = new Product("카페라떼(H)", 3500, "Coffee");
      Product IcedCaffeLatte = new Product("카페라떼(C)", 3500, "Coffee");

      Product HotVanillaLatte = new Product("바닐라라떼(H)", 3500, "Coffee");
      Product IcedVanillaLatte = new Product("바닐라라떼(C)", 3500, "Coffee");

      Product HotCaramelMacchiato = new Product("카라멜마끼아또(H)", 3500, "Coffee");
      Product IcedCaramelMacchiato = new Product("카라멜마끼아또(C)", 3500, "Coffee");

      Product HotWhiteCaffeMocha = new Product("화이트카페모카(H)", 4000, "Coffee");
      Product IcedWhiteCaffeMocha = new Product("화이트카페모카(C)", 4000, "Coffee");

      Product Cappuccino = new Product("카푸치노", 3500, "Coffee");

      this.coffeeMenu()[0] = Espresso;
      this.coffeeMenu()[1] = HotAmericano;
      this.coffeeMenu()[2] = IcedAmericano;
      this.coffeeMenu()[3] = HotCaffeLatte;
      this.coffeeMenu()[4] = IcedCaffeLatte;
      this.coffeeMenu()[5] = HotVanillaLatte;
      this.coffeeMenu()[6] = IcedVanillaLatte;
      this.coffeeMenu()[7] = HotCaramelMacchiato;
      this.coffeeMenu()[8] = IcedCaramelMacchiato;
      this.coffeeMenu()[9] = HotWhiteCaffeMocha;
      this.coffeeMenu()[10] = IcedWhiteCaffeMocha;
      this.coffeeMenu()[11] = Cappuccino;

   }

   public void fixedDrinkMenu() {

      Product OmijaAde = new Product("오미자에이드", 3500, "Ade");
      Product OrangeAde = new Product("오렌지에이드", 3500, "Ade");
      Product HanrabongAde = new Product("한라봉에이드", 3800, "Ade");
      Product PinkBerry = new Product("핑크베리유스베리", 3800, "Ade");
      Product Lime = new Product("쿨라임피지오", 3800, "Ade");
      Product BlackTeaLemonade = new Product("블랙티레모네이드", 3800, "Ade");
      // Product CitronAndGrapefruit = new Product("유자 자몽 에이드", 3800, "Ade");

      Product StrawberryYogurt = new Product("딸기요거트스무디", 4000, "Smoothie");
      Product ChocolateBanana = new Product("초콜릿바나나스무디", 4000, "Smoothie");
      Product MangoFruit = new Product("망고후르츠스무디", 4300, "Smoothie");
      Product PeachYogurt = new Product("피치요거트스무디", 4300, "Smoothie");
      Product BlueBerry = new Product("블루베리스무디", 4300, "Smoothie");
      // Product AppleKiwi = new Product("애플키위 스무디", 4300, "Smoothie");

      this.drinkMenu()[0] = OmijaAde;
      this.drinkMenu()[1] = OrangeAde;
      this.drinkMenu()[2] = HanrabongAde;
      this.drinkMenu()[3] = PinkBerry;
      this.drinkMenu()[4] = Lime;
      this.drinkMenu()[5] = BlackTeaLemonade;
      // this.drinkMenu()[6] = CitronAndGrapefruit;

      this.drinkMenu()[6] = StrawberryYogurt;
      this.drinkMenu()[7] = ChocolateBanana;
      this.drinkMenu()[8] = MangoFruit;
      this.drinkMenu()[9] = PeachYogurt;
      this.drinkMenu()[10] = BlueBerry;
      // this.drinkMenu()[12] = AppleKiwi;

   }

   public void fixedSideMenu() {

      Product PeachCake = new Product("복숭아케이크", 4500, "Cake");
      Product CreamCheeseCake = new Product("크림치즈케이크", 5000, "Cake");
      Product TiramisuCake = new Product("티라미슈", 4000, "Cake");

      Product InkCheeseMini = new Product("먹물치즈미니식빵", 5000, "Bread");
      Product GarlicPie = new Product("갈릭파이", 4000, "Bread");
      Product CaramelChiffon = new Product("카라멜쉬폰", 5000, "Bread");

      Product SpicyChicken = new Product("치킨샌드위치", 5500, "Sandwich");
      Product YoungLeaf = new Product("어린잎채소샌드위치", 5000, "Sandwich");

      Product Milk = new Product("밀크아이스크림", 2000, "Icecream");

      this.sideMenu()[0] = PeachCake;
      this.sideMenu()[1] = CreamCheeseCake;
      this.sideMenu()[2] = TiramisuCake;

      this.sideMenu()[3] = InkCheeseMini;
      this.sideMenu()[4] = GarlicPie;
      this.sideMenu()[5] = CaramelChiffon;

      this.sideMenu()[6] = SpicyChicken;
      this.sideMenu()[7] = YoungLeaf;

      this.sideMenu()[8] = Milk;

   }

   public void fixedSeasonMenu() {

      Product DutchCoffeeIce = new Product("더치커피빙수", 9800, "Season");
      Product MangoIce = new Product("망고빙수", 10800, "Season");
      Product BerryIce = new Product("베리빙수", 10800, "Season");

      this.seasonMenu()[0] = DutchCoffeeIce;
      this.seasonMenu()[1] = MangoIce;
      this.seasonMenu()[2] = BerryIce;

   }

   public void fixedAllMenu() {
      this.fixedCoffeeMenu();
      this.fixedDrinkMenu();
      this.fixedSideMenu();
      this.fixedSeasonMenu();
   }

   public void addMenu(Product aProduct) {

      Product addProduct = new Product();

      if (aProduct != null) {
         addProduct = aProduct;

         switch (addProduct.type()) {

         case "Coffee":
            int coffeeSize = 0;

            for (int i = 0; i < this.coffeeMenu().length - 1; i++) {
               if (this.coffeeMenu()[i] == null) {
                  coffeeSize = i;
                  this.coffeeMenu()[coffeeSize] = addProduct;
                  break;
               }
            }

         case "Drink":
            int drinkSize = 0;

            for (int i = 0; i < this.drinkMenu().length - 1; i++) {
               if (this.drinkMenu()[i] == null) {
                  drinkSize = i;
                  this.drinkMenu()[drinkSize] = addProduct;
                  break;
               }
            }

         case "Side":
            int sideSize = 0;

            for (int i = 0; i < this.sideMenu().length - 1; i++) {
               if (this.sideMenu()[i] == null) {
                  sideSize = i;
                  this.sideMenu()[sideSize] = addProduct;
                  break;
               }
            }

         case "Season":
            int seasonSize = 0;

            for (int i = 0; i < this.seasonMenu().length - 1; i++) {
               if (this.seasonMenu()[i] == null) {
                  seasonSize = i;
                  this.seasonMenu()[seasonSize] = addProduct;
                  break;
               }
            }

         default:
            AppIO.outputLine("type명 오류");
            break;
         }
      }
   }

   public Product findMenu(String aName, String aType) {

      String findType = aType;
      String findName = aName;

      switch (findType) {
      case "Coffee":

         for (int i = 0; i < this.coffeeMenu().length - 1; i++) {
            if (this.coffeeMenu()[i].name() == findName) {
               return this.coffeeMenu()[i];
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Coffee에 존재하지 않습니다.");
            }
         }
         break;

      case "Drink":

         for (int i = 0; i < this.drinkMenu().length - 1; i++) {
            if (this.drinkMenu()[i].name() == findName) {
               return this.drinkMenu()[i];
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Ade에 존재하지 않습니다.");
            }
         }
         break;

      case "Side":

         for (int i = 0; i < this.sideMenu().length - 1; i++) {
            if (this.sideMenu()[i].name() == findName) {
               return this.sideMenu()[i];
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Smoothie에 존재하지 않습니다");
            }
         }
         break;

      case "Season":

         for (int i = 0; i < this.seasonMenu().length - 1; i++) {
            if (this.seasonMenu()[i].name() == findName) {
               return this.seasonMenu()[i];
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Season에 존재하지 않습니다.");
            }
         }
         break;

      default:
         AppIO.outputLine("찾고자 하는 메뉴 타입이 존재하지 않습니다.");
         break;
      }
      return null;
   }

   public void removeMenu(String aName, String aType) {

      String findType = aType;
      String findName = aName;

      switch (findType) {
      case "Coffee":

         for (int i = 0; i < this.coffeeMenu().length - 1; i++) {
            if (this.coffeeMenu()[i].name() == findName) {

               this.coffeeMenu()[i] = null;

               for (int j = i + 1; j < this.coffeeMenu().length - 1; j++) {
                  this.coffeeMenu()[i] = this.coffeeMenu()[j];
                  i++;
               }

            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Coffee에 존재하지 않습니다.");
            }
         }
         break;

      case "Drink":

         for (int i = 0; i < this.drinkMenu().length - 1; i++) {
            if (this.drinkMenu()[i].name() == findName) {

               this.drinkMenu()[i] = null;

               for (int j = i + 1; j < this.drinkMenu().length - 1; j++) {
                  this.drinkMenu()[i] = this.drinkMenu()[j];
                  i++;
               }
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Ade에 존재하지 않습니다.");
            }
         }
         break;

      case "Side":

         for (int i = 0; i < this.sideMenu().length - 1; i++) {
            if (this.sideMenu()[i].name() == findName) {
               this.sideMenu()[i] = null;

               for (int j = i + 1; j < this.sideMenu().length - 1; j++) {
                  this.sideMenu()[i] = this.sideMenu()[j];
                  i++;
               }
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Smoothie에 존재하지 않습니다");
            }
         }
         break;

      case "Season":

         for (int i = 0; i < this.seasonMenu().length - 1; i++) {
            if (this.seasonMenu()[i].name() == findName) {
               this.seasonMenu()[i] = null;

               for (int j = i + 1; j < this.seasonMenu().length - 1; j++) {
                  this.seasonMenu()[i] = this.seasonMenu()[j];
                  i++;
               }
            } else {
               AppIO.outputLine("찾고자하는 메뉴가 Season에 존재하지 않습니다.");
            }
         }
         break;

      default:
         AppIO.outputLine("찾고자 하는 메뉴 타입이 존재하지 않습니다.");
         break;
      }
   }
}