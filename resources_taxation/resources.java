/*@startum1

title Resources \nof title

Class Resources{
	playerID : enum = {Imperial, Rebel}
	amount : Integer
	int Tax(int GameTurn, int provinceID, int amount, enum {full, half, none})
	int GetResources(int provinceID, int GameTurn)
}

Class ForcePoints{
	void BuyMilitaryUnit(int unitID)
	void UpgradePDB()
	void TurnPDBOn()
}

Class MilitaryUnits{
	Unit Cost Chart
	void ReceiveMilitaryUnit()
}

Class PlanetDefenseBase{
	planetID : Integer
	isUp : Boolean
	level : Integer
	void Upgrade()
	void TurnOn()
}

hide circles
Resources o-- MilitaryUnits
Resource o-- ForcePoints

ForcePoints - MilitaryUnits : Buy >
MilitaryUnits - ForcePoints : < Receive

ForcePoints - PlanetDefenseBase : < Upgrade
ForcePoints - PlanetDefenseBase : < TurnOn 

@endum1
*/