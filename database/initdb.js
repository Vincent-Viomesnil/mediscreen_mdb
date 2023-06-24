const collection = new Map();

function insertDocument(id, lastname, notes, patId) {
  const document = {
    _id: id,
    lastname: lastname,
    notes: notes,
    patId: patId
  };
  collection.set(id, document);
}

insertDocument("6478a8463421bbb5fd86fd9d", "TestNone", "Patient states that they are 'feeling terrific' None at or below recommended level", 1);

insertDocument("6478a8463421bbb5fd86fd9e", "TestBorderline", "Patient states that they are feeling a great deal of stress at work Patient also complains that their hearing seems Abnormal as of late", 2);

insertDocument("6478a8463421bbb5fd86fd9f", "TestBorderline", "Patient states that they have had a Reaction to medication within last 3 months Patient also complains that their hearing continues to be problematic", 2);

insertDocument("6478a8463421bbb5fd86fda0", "TestInDanger", "Patient states that they are short term Smoker", 3);

insertDocument("6478a8463421bbb5fd86fda1", "TestInDanger", "Patient states that they quit within last year Patient also complains that of Abnormal breathing spells Lab reports Cholesterol LDL high", 3);

insertDocument("6478a8463421bbb5fd86fda2", "TestEarlyOnset", "Patient states that walking up stairs has become difficult Patient also complains that they are having shortness of breath Lab results indicate Antibodies present elevated Reaction to medication", 4);

insertDocument("6478a8463421bbb5fd86fda3", "TestEarlyOnset", "Patient states that they are experiencing back pain when seated for a long time", 4);

insertDocument("6478a8463421bbb5fd86fda4", "TestEarlyOnset", "Patient states that they are a short term Smoker Hemoglobin A1C above recommended level", 4);

insertDocument("6478a8463421bbb5fd86fda5", "TestEarlyOnset", "Patient states that Body Height, Body Weight, Cholesterol, Dizziness and Reaction", 4);

insertDocument("647f01dfaa98f5c8b4504ffc", "Ferguson", "Le patient déclare qu'il se sent très bien\r\nPoids égal ou inférieur au poids recommandé", 5);

insertDocument("647f01dfaa98f5c8b4504ffd", "Ferguson", "Le patient déclare qu'il se sent fatigué pendant la journée\r\nIl se plaint également de douleurs musculaires\r\nTests de laboratoire indiquant une microalbumine élevée", 5);

insertDocument("647f01dfaa98f5c8b4504ffe", "Ferguson", "Le patient déclare qu'il ne se sent pas si fatigué que ça\r\nFumeur, il a arrêté dans les 12 mois précédents\r\nTests de laboratoire indiquant que les anticorps sont élevés", 5);

insertDocument("647f01dfaa98f5c8b4504fff", "Rees", "Le patient déclare qu'il ressent beaucoup de stress au travail\r\nIl se plaint également que son audition est anormale dernièrement", 6);

insertDocument("647f01dfaa98f5c8b4505000", "Rees", "Le patient déclare avoir fait une réaction aux médicaments au cours des 3 derniers mois\r\nIl remarque également que son audition continue d'être anormale", 6);

insertDocument("647f01dfaa98f5c8b4505001", "Rees", "Tests de laboratoire indiquant une microalbumine élevée", 6);

insertDocument("647f01dfaa98f5c8b4505002", "Rees", "Le patient déclare que tout semble aller bien\r\nLe laboratoire rapporte que l'hémoglobine A1C dépasse le niveau recommandé\r\nLe patient déclare qu’il fume depuis longtemps", 6);

insertDocument("647f01dfaa98f5c8b4505003", "Arnold", "Le patient déclare qu'il fume depuis peu", 7);

insertDocument("647f01dfaa98f5c8b4505004", "Arnold", "Tests de laboratoire indiquant une microalbumine élevée", 7);

insertDocument("647f01dfaa98f5c8b4505005", "Arnold", "Le patient déclare qu'il est fumeur et qu'il a cessé de fumer l'année dernière\r\nIl se plaint également de crises d’apnée respiratoire anormales\r\nTests de laboratoire indiquant un taux de cholestérol LDL élevé", 7);

insertDocument("647f01dfaa98f5c8b4505006", "Arnold", "Tests de laboratoire indiquant un taux de cholestérol LDL élevé", 7);

insertDocument("647f01dfaa98f5c8b4505007", "Sharp", "Le patient déclare qu'il lui est devenu difficile de monter les escaliers\r\nIl se plaint également d’être essoufflé\r\nTests de laboratoire indiquant que les anticorps sont élevés\r\nRéaction aux médicaments", 8);

insertDocument("647f01dfaa98f5c8b4505008", "Sharp", "Le patient déclare qu'il a mal au dos lorsqu'il reste assis pendant longtemps", 8);

insertDocument("647f01dfaa98f5c8b4505009", "Sharp", "Le patient déclare avoir commencé à fumer depuis peu\r\nHémoglobine A1C supérieure au niveau recommandé", 8);

insertDocument("647f01dfaa98f5c8b450500a", "Ince", "Le patient déclare avoir des douleurs au cou occasionnellement\r\nLe patient remarque également que certains aliments ont un goût différent\r\nRéaction apparente aux médicaments\r\nPoids corporel supérieur au poids recommandé", 9);

insertDocument("647f01dfaa98f5c8b450500b", "Ince", "Le patient déclare avoir eu plusieurs épisodes de vertige depuis la dernière visite.\r\nTaille incluse dans la fourchette concernée", 9);

insertDocument("647f01dfaa98f5c8b450500c", "Ince", "Le patient déclare qu'il souffre encore de douleurs cervicales occasionnelles\r\nTests de laboratoire indiquant une microalbumine élevée\r\nFumeur, il a arrêté dans les 12 mois précédents", 9);

insertDocument("647f01dfaa98f5c8b450500d", "Ince", "Le patient déclare avoir eu plusieurs épisodes de vertige depuis la dernière visite.\r\nTests de laboratoire indiquant que les anticorps sont élevés", 9);

insertDocument("647f01dfaa98f5c8b450500e", "Ross", "Le patient déclare qu'il se sent bien\r\nPoids corporel supérieur au poids recommandé", 10);

insertDocument("647f01dfaa98f5c8b450500f", "Ross", "Le patient déclare qu'il se sent bien", 10);

insertDocument("647f01dfaa98f5c8b4505010", "Wilson", "Le patient déclare qu'il se réveille souvent avec une raideur articulaire\r\nIl se plaint également de difficultés pour s’endormir\r\nPoids corporel supérieur au poids recommandé\r\nTests de laboratoire indiquant un taux de cholestérol LDL élevé", 11);

insertDocument("647f01dfaa98f5c8b4505011", "Buckland", "Les tests de laboratoire indiquent que les anticorps sont élevés\r\nHémoglobine A1C supérieure au niveau recommandé", 12);

insertDocument("647f01dfaa98f5c8b4505012", "Clark", "Le patient déclare avoir de la difficulté à se concentrer sur ses devoirs scolaires\r\nHémoglobine A1C supérieure au niveau recommandé", 13);

insertDocument("647f01dfaa98f5c8b4505013", "Clark", "Le patient déclare s’impatienter facilement en cas d’attente prolongée\r\nIl signale également que les produits du distributeur automatique ne sont pas bons\r\nTests de laboratoire signalant des taux anormaux de cellules sanguines", 13);

insertDocument("647f01dfaa98f5c8b4505014", "Clark", "Le patient signale qu'il est facilement irrité par des broutilles\r\nIl déclare également que l'aspirateur des voisins fait trop de bruit\r\nTests de laboratoire indiquant que les anticorps sont élevés", 13);

insertDocument("647f01dfaa98f5c8b4505015", "Bailey", "Le patient déclare qu'il n'a aucun problème", 14);

insertDocument("647f01dfaa98f5c8b4505016", "Bailey", "Le patient déclare qu'il n'a aucun problème\r\nTaille incluse dans la fourchette concernée\r\nHémoglobine A1C supérieure au niveau recommandé", 14);

insertDocument("647f01dfaa98f5c8b4505017", "Bailey", "Le patient déclare qu'il n'a aucun problème\r\nPoids corporel supérieur au poids recommandé\r\nLe patient a signalé plusieurs épisodes de vertige depuis sa dernière visite", 14);

insertDocument("647f01dfaa98f5c8b4505018", "Bailey", "Le patient déclare qu'il n'a aucun problème\r\nTests de laboratoire indiquant une microalbumine élevée", 14);
