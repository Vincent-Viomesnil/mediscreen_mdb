const db = db.getSiblingDB("MediscreenDatabase");

db.Notes.insertMany(
        [
            {
                    "lastname": "TestNone",
                    "notes": "Patient states that they are 'feeling terrific' None at or below recommended level",
                    "patId": 1
            },
{
        "lastname": "TestBorderline",
    "notes": "Patient states that they are feeling a great deal of stress at work Patient also complains that their hearing seems Abnormal as of late",
    "patId": 2
},
{
        "lastname": "TestBorderline",
    "notes": "Patient states that they have had a Reaction to medication within last 3 months Patient also complains that their hearing continues to be problematic",
    "patId": 2
},
{
        "lastname": "TestInDanger",
    "notes": "Patient states that they are short term Smoker",
    "patId": 3
},
{
        "lastname": "TestInDanger",
    "notes": "Patient states that they quit within last year Patient also complains that of Abnormal breathing spells Lab reports Cholesterol LDL high",
    "patId": 3
},
{
        "lastname": "TestEarlyOnset",
    "notes": "Patient states that walking up stairs has become difficult Patient also complains that they are having shortness of breath Lab results indicate Antibodies present elevated Reaction to medication",
    "patId": 4
},
{
        "lastname": "TestEarlyOnset",
    "notes": "Patient states that they are experiencing back pain when seated for a long time",
    "patId": 4
},
{
        "lastname": "TestEarlyOnset",
    "notes": "Patient states that they are a short term Smoker Hemoglobin A1C above recommended level",
    "patId": 4
},
{
        "lastname": "TestEarlyOnset",
    "notes": "Patient states that Body Height, Body Weight, Cholesterol, Dizziness and Reaction",
    "patId": 4
},
{
        "patId": 5,
    "lastname": "Ferguson",
    "notes": "Le patient déclare qu'il se sent très bien\r\nPoids égal ou inférieur au poids recommandé"
},
{
        "patId": 5,
    "lastname": "Ferguson",
    "notes": "Le patient déclare qu'il se sent fatigué pendant la journée\r\nIl se plaint également de douleurs musculaires\r\nTests de laboratoire indiquant une microalbumine élevée"
},
{
        "patId": 5,
    "lastname": "Ferguson",
    "notes": "Le patient déclare qu'il ne se sent pas si fatigué que ça\r\nFumeur, il a arrêté dans les 12 mois précédents\r\nTests de laboratoire indiquant que les anticorps sont élevés"
},
{
        "patId": 6,
    "lastname": "Rees",
    "notes": "Le patient déclare qu'il ressent beaucoup de stress au travail\r\nIl se plaint également que son audition est anormale dernièrement"
},
{
        "patId": 6,
    "lastname": "Rees",
    "notes": "Le patient déclare avoir fait une réaction aux médicaments au cours des 3 derniers mois\r\nIl remarque également que son audition continue d'être anormale"
},
{
        "patId": 6,
    "lastname": "Rees",
    "notes": "Tests de laboratoire indiquant une microalbumine élevée"
},
{
        "patId": 6,
    "lastname": "Rees",
    "notes": "Le patient déclare que tout semble aller bien\r\nLe laboratoire rapporte que l'hémoglobine A1C dépasse le niveau recommandé\r\nLe patient déclare qu’il fume depuis longtemps"
},
{
        "patId": 7,
    "lastname": "Arnold",
    "notes": "Le patient déclare qu'il fume depuis peu"
},
{
        "patId": 7,
    "lastname": "Arnold",
    "notes": "Tests de laboratoire indiquant une microalbumine élevée"
},
{
        "patId": 7,
    "lastname": "Arnold",
    "notes": "Le patient déclare qu'il est fumeur et qu'il a cessé de fumer l'année dernière\r\nIl se plaint également de crises d’apnée respiratoire anormales\r\nTests de laboratoire indiquant un taux de cholestérol LDL élevé"
},
{
        "patId": 7,
    "lastname": "Arnold",
    "notes": "Tests de laboratoire indiquant un taux de cholestérol LDL élevé"
},
{
        "patId": 8,
    "lastname": "Sharp",
    "notes": "Le patient déclare qu'il lui est devenu difficile de monter les escaliers\r\nIl se plaint également d’être essoufflé\r\nTests de laboratoire indiquant que les anticorps sont élevés\r\nRéaction aux médicaments"
},
{
        "patId": 8,
    "lastname": "Sharp",
    "notes": "Le patient déclare qu'il a mal au dos lorsqu'il reste assis pendant longtemps"
},
{
        "patId": 8,
    "lastname": "Sharp",
    "notes": "Le patient déclare avoir commencé à fumer depuis peu\r\nHémoglobine A1C supérieure au niveau recommandé "
},
{
        "patId": 9,
    "lastname": "Ince",
    "notes": "Le patient déclare avoir des douleurs au cou occasionnellement\r\nLe patient remarque également que certains aliments ont un goût différent\r\nRéaction apparente aux médicaments\r\nPoids corporel supérieur au poids recommandé"
},
{
        "patId": 9,
    "lastname": "Ince",
    "notes": "Le patient déclare avoir eu plusieurs épisodes de vertige depuis la dernière visite.\r\nTaille incluse dans la fourchette concernée"
},
{
        "patId": 9,
    "lastname": "Ince",
    "notes": "Le patient déclare qu'il souffre encore de douleurs cervicales occasionnelles\r\nTests de laboratoire indiquant une microalbumine élevée\r\nFumeur, il a arrêté dans les 12 mois précédents"
},
{
        "patId": 9,
    "lastname": "Ince",
    "notes": "Le patient déclare avoir eu plusieurs épisodes de vertige depuis la dernière visite.\r\nTests de laboratoire indiquant que les anticorps sont élevés"
},
{
        "patId": 10,
    "lastname": "Ross",
    "notes": "Le patient déclare qu'il se sent bien\r\nPoids corporel supérieur au poids recommandé"
},
{
        "patId": 10,
    "lastname": "Ross",
    "notes": "Le patient déclare qu'il se sent bien"
},
{
        "patId": 11,
    "lastname": "Wilson",
    "notes": "Le patient déclare qu'il se réveille souvent avec une raideur articulaire\r\nIl se plaint également de difficultés pour s’endormir\r\nPoids corporel supérieur au poids recommandé\r\nTests de laboratoire indiquant un taux de cholestérol LDL élevé"
},
{
        "patId": 12,
    "lastname": "Buckland",
    "notes": "Les tests de laboratoire indiquent que les anticorps sont élevés\r\nHémoglobine A1C supérieure au niveau recommandé"
},
{
        "patId": 13,
    "lastname": "Clark",
    "notes": "Le patient déclare avoir de la difficulté à se concentrer sur ses devoirs scolaires\r\nHémoglobine A1C supérieure au niveau recommandé"
},
{
        "patId": 13,
    "lastname": "Clark",
    "notes": "Le patient déclare qu'il s’impatiente facilement en cas d’attente prolongée\r\nIl signale également que les produits du distributeur automatique ne sont pas bons\r\nTests de laboratoire signalant des taux anormaux de cellules sanguines"
},
{
        "patId": 13,
    "lastname": "Clark",
    "notes": "Le patient signale qu'il est facilement irrité par des broutilles\r\nIl déclare également que l'aspirateur des voisins fait trop de bruit\r\nTests de laboratoire indiquant que les anticorps sont élevés"
},
{
        "patId": 14,
    "lastname": "Bailey",
    "notes": "Le patient déclare qu'il n'a aucun problème"
},
{
        "patId": 14,
    "lastname": "Bailey",
    "notes": "Le patient déclare qu'il n'a aucun problème\r\nTaille incluse dans la fourchette concernée\r\nHémoglobine A1C supérieure au niveau recommandé"
},
{
        "patId": 14,
    "lastname": "Bailey",
    "notes": "Le patient déclare qu'il n'a aucun problème\r\nPoids corporel supérieur au poids recommandé\r\nLe patient a signalé plusieurs épisodes de vertige depuis sa dernière visite"
},
{
        "patId": 14,
    "lastname": "Bailey",
    "notes": "Le patient déclare qu'il n'a aucun problème\r\nTests de laboratoire indiquant une microalbumine élevée"

}]);