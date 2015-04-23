/**
 * Created by Maik Wandrei on 23.04.2015.
 */
abstract class Price {
    abstract int getPriceCode();

    double getCharge(int daysRented){
        return daysRented * 3;
    }
}

class ChildrensPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }
}

class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }
}

class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }
}
