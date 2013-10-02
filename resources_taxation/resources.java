@startuml
title Resources
	Class Resources{
		playerID: Enum = {Imperial, Rebel}
		amount: Integer
		int Tax(int GameTurn, int provinceID, int amount, enum {full, half, none})
		int GetResources(int provinceID, int GameTurn)
	}
	
	Class MilitaryUnits{
		Unit Cost Chart
		void ReceiveMilitaryUnit()
	}
	
	Class ForcePoints{
		void BuyMilitaryUnit(int unitID)
		void UpgradePDB()
		void TurnPDBOn()	
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
	Resources o-- ForcePoints
	
	ForcePoints - MilitaryUnits: Buy >
	ForcePoints - MilitaryUnits: < Receive
	
	PlanetDefenseBase - ForcePoints: < Upgrade
	PlanetDefenseBase - ForcePoints: < TurnOn
	@enduml