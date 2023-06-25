const db = db.getSiblingDB("MediscreenDatabase");

db.Notes.insertOne({
        lastname: "TestNone",
        notes: "Patient states that they are 'feeling terrific' None at or below recommended level",
        patId: 1
});