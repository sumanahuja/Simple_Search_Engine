class BankAccount(deposited: Long, withdrawn: Long) {
    val deposited: Long = deposited
    val withdrawn: Long = withdrawn
    val balance: Long = deposited - withdrawn
}
