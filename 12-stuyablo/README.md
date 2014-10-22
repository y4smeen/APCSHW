Make each class have a function to change the health of that object. This method is then used from within the attack method of another object.

Baseclass -Name -Status ailment (boolean) -Health -attack, dictates the amount of health to deduct on attacking. -Dexterity, chance to dodge an attack. -Armor/defense -Attack method, invokes the changehealth method of another object, Gives a random value to deduct from health. (random value depends on attack of warrior or wizard attack in respective classes) The attack may or not land depending on the dexterity value of the target, and the health deducted varies directly with armor. -ChangeHealth method, changes the private health value -Status ailment method which deducts health if there is a status ailment. -Inventory -Experience -Level -Method distribute points Get points to put into attributes -Stamina attribute -Potions that heal the health method (healthTheHealth)

Warrior -Health (higher than that of a mage) -attack higher than baseclass -Dexterity is higher -Armor is higher -Attack is higher -attack

Mage -Health lower -Magic attack power variable -magic attack method, in addition to doing damage causes a status ailment. chance of getting status ailment, changes the status ailment variable to true. -Dexterity lower -Armor lower -Mana Attribute

System -Running away depends on dexterity -Dexterity determines move order -Stats correlate with level
-Attack will be a range depending on the strength -As for the mage it is constant for the magic attack -Health correlates with strength
-Results screen displaying who won
