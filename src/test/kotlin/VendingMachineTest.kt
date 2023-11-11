import org.testng.annotations.BeforeTest
import org.testng.annotations.Test

class VendingMachineTest {

    private fun tenCentCoin() = Coin(19.75, 4.10)

    @Test
    fun `vending machine exists in ready state`() {
        val vendingMachine = VendingMachine()

        assert(vendingMachine.displayString == "INSERT COIN")
        assert(vendingMachine.totalCoinValue == 0.0)
    }

    @Test
    fun `vending machine accepts ten cent coins`() {
        val vendingMachine = VendingMachine()

        vendingMachine.coinInserted(tenCentCoin())
        assert(vendingMachine.displayString == "€0.1")
        assert(vendingMachine.totalCoinValue == 0.1)
    }
}