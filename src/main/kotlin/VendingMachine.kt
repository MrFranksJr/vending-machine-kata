class VendingMachine {
    var totalCoinValue = 0.00
    var displayString = "INSERT COIN"

    fun coinInserted(coin: Coin) {
        if (coin.weight == 4.10 && coin.dimension == 19.75) {
            totalCoinValue += 0.10
            displayString = "€${totalCoinValue}"
        }
    }
}
