package com.prafullkumar.workout.data.exercise

import com.prafullkumar.workout.data.db.ExerciseEntity
import com.prafullkumar.workout.domain.model.BodyPart

data class Exercise(
    val name: String,
    val equipmentUsed: Int, // Refers to equipment index from the map
    val youtubeTutorial: String,
    val muscles: List<BodyPart>,
    val instructions: String
) {
    fun toExerciseEntity(): ExerciseEntity {
        return ExerciseEntity(
            name = name,
            equipmentUsed = equipmentUsed,
            youtubeTutorial = youtubeTutorial,
            muscles = muscles.map { it.name },
            instructions = instructions
        )
    }
}

val upperChestExercises = listOf(
    Exercise(
        name = "Incline Barbell Bench Press",
        equipmentUsed = 6, // Adjustable Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=4Y2ZdHCOXok",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Lie on an incline bench set to 30-45 degrees. Grip the bar slightly wider than shoulder-width. Lower it to your upper chest and press back up."
    ),
    Exercise(
        name = "Incline Dumbbell Bench Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=8iPEnn-ltC8",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Sit on an incline bench with a dumbbell in each hand. Press the weights up and together, then lower them under control."
    ),
    Exercise(
        name = "Incline Machine Chest Press",
        equipmentUsed = 21, // Incline Chest Press Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=mJb6Yxg15Tc",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Sit in the machine, grip the handles, and press forward. Slowly return to the starting position."
    ),
    Exercise(
        name = "Incline Cable Fly",
        equipmentUsed = 16, // Cable Crossover Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=KXt6Rz6acmM",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Set the cables high, take a step forward, and bring the handles together in an arc motion."
    ),
    Exercise(
        name = "Incline Dumbbell Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=3BuVnc3Xh3g",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Lie on an incline bench, hold dumbbells above your chest, and lower them in a controlled arc before bringing them back together."
    ),
    Exercise(
        name = "Incline Smith Machine Press",
        equipmentUsed = 9, // Smith Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=OvQ0-NqSH64",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Set the Smith machine bar at an incline, lower it to your chest, then press upward."
    ),
    Exercise(
        name = "Incline Hex Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Xn--PEiJ6pQ",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Press two dumbbells together above your chest and move them up and down in a controlled motion."
    ),
    Exercise(
        name = "Incline Guillotine Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ClwqAlHTB7M",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Perform a barbell bench press, lowering the bar closer to your neck instead of your chest to target the upper fibers."
    ),
    Exercise(
        name = "Reverse Grip Incline Bench Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Thl-xW4FrrA",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Use an underhand grip on the barbell and press upwards while keeping elbows tucked."
    ),
    Exercise(
        name = "Landmine Incline Press",
        equipmentUsed = 44, // Landmine Attachment
        youtubeTutorial = "https://www.youtube.com/watch?v=ZNzTMB1mty4",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Press a barbell fixed in a landmine attachment at an upward angle."
    ),
    Exercise(
        name = "Incline Push-Up",
        equipmentUsed = 7, // Flat Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=_M2Etme-tfE",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Place your hands on an elevated surface and perform a push-up."
    ),
    Exercise(
        name = "Incline Plyometric Push-Up",
        equipmentUsed = 7, // Flat Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=HB2pUUHhiDU",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Perform an incline push-up but push off explosively so that your hands leave the bench."
    ),
    Exercise(
        name = "Incline Hammer Strength Press",
        equipmentUsed = 21, // Incline Chest Press Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=FMHeF-m5pWw",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Use a Hammer Strength incline press machine to perform a controlled press."
    ),
    Exercise(
        name = "Incline Svend Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=2zGwnmZTf3g",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Press two plates or dumbbells together in front of your chest and extend your arms."
    ),
    Exercise(
        name = "Incline Cable Press",
        equipmentUsed = 16, // Cable Crossover Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=6LtAaDYH-qQ",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Set the cables low and press forward at an upward angle."
    ),
    Exercise(
        name = "Incline Close-Grip Bench Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=xQsYzGSA4j8",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST, BodyPart.TRICEPS),
        instructions = "Use a close grip and press upward, keeping elbows tucked."
    ),
    Exercise(
        name = "Incline Dumbbell Pullover",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Rk_wf6gsGqA",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST, BodyPart.LATS),
        instructions = "Lower a dumbbell behind your head while keeping your arms extended."
    ),
    Exercise(
        name = "Incline Band Press",
        equipmentUsed = 35, // Resistance Bands
        youtubeTutorial = "https://www.youtube.com/watch?v=9xAxC2xKmO8",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Attach resistance bands behind you and press forward at an incline angle."
    ),
    Exercise(
        name = "Incline Dumbbell Squeeze Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=NjF5SThJv2E",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Press two dumbbells together throughout the movement to increase chest activation."
    ),
    Exercise(
        name = "Incline Isometric Hold Push-Up",
        equipmentUsed = 7, // Flat Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=6GrGrNRcLOI",
        muscles = listOf(BodyPart.UPPER_CHEST, BodyPart.CHEST),
        instructions = "Hold an incline push-up at the halfway position for time under tension."
    )
)
val lowerChestExercises = listOf(
    Exercise(
        name = "Decline Barbell Bench Press",
        equipmentUsed = 6, // Adjustable Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=8Py2eZ0kwWc",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Lie on a decline bench with a barbell. Lower it to your lower chest and press back up."
    ),
    Exercise(
        name = "Decline Dumbbell Bench Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Kz0qC5e5LN4",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Hold dumbbells above your chest on a decline bench and press them up while keeping control."
    ),
    Exercise(
        name = "Decline Machine Chest Press",
        equipmentUsed = 22, // Decline Chest Press Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=YFf7-vss3Jw",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Sit in the decline chest press machine, grip the handles, and press forward."
    ),
    Exercise(
        name = "Dips (Chest Focus)",
        equipmentUsed = 14, // Parallel Bars/Dip Station
        youtubeTutorial = "https://www.youtube.com/watch?v=wjUmnZH528Y",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST, BodyPart.TRICEPS),
        instructions = "Lean forward while dipping to engage the lower chest. Keep elbows slightly flared."
    ),
    Exercise(
        name = "Decline Cable Fly",
        equipmentUsed = 16, // Cable Crossover Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=ZADwD7hYl0c",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Set the cables high and bring them down and together in an arc motion."
    ),
    Exercise(
        name = "Decline Dumbbell Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ABiD4hbdFkk",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Lower dumbbells in an arc on a decline bench, keeping a slight bend in the elbows."
    ),
    Exercise(
        name = "Decline Smith Machine Press",
        equipmentUsed = 9, // Smith Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=7XIfaXvnuy4",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Perform a decline bench press using a Smith machine for stability."
    ),
    Exercise(
        name = "Weighted Chest Dips",
        equipmentUsed = 14, // Dip Station + Weight Belt
        youtubeTutorial = "https://www.youtube.com/watch?v=HusfiItI0Xk",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST, BodyPart.TRICEPS),
        instructions = "Attach weight and lean forward during dips to maximize lower chest activation."
    ),
    Exercise(
        name = "Decline Close-Grip Bench Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Xh2ef_mE8eA",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST, BodyPart.TRICEPS),
        instructions = "Use a close grip and press upward while keeping elbows tucked."
    ),
    Exercise(
        name = "Push-Ups (Feet Elevated)",
        equipmentUsed = 7, // Flat Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=2UuZNmgBhlE",
        muscles = listOf(BodyPart.LOWER_CHEST, BodyPart.CHEST),
        instructions = "Elevate your feet on a bench and perform push-ups to emphasize the lower chest."
    )
)
val backExercises = listOf(
    Exercise(
        name = "Deadlift",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=3UwO0fKukRw",
        muscles = listOf(BodyPart.BACK, BodyPart.ERECTOR_SPINAE, BodyPart.LATS, BodyPart.TRAPS),
        instructions = "Stand with feet shoulder-width apart, grip the barbell, hinge at hips, and lift with a straight back."
    ),
    Exercise(
        name = "Pull-Up",
        equipmentUsed = 18, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=eGo4IYlbE5g",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.TRAPS, BodyPart.RHOMBOIDS),
        instructions = "Grip the pull-up bar with palms facing away, pull yourself up until your chin clears the bar, then lower slowly."
    ),
    Exercise(
        name = "Chin-Up",
        equipmentUsed = 18, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=brhRXlOhsAM",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.BICEPS),
        instructions = "Use an underhand grip on the pull-up bar, pull yourself up and squeeze at the top."
    ),
    Exercise(
        name = "Barbell Bent-Over Row",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=vT2GjY_Umpw",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.TRAPS, BodyPart.RHOMBOIDS),
        instructions = "Bend at the hips, keep your back straight, and pull the barbell towards your torso."
    ),
    Exercise(
        name = "Single-Arm Dumbbell Row",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=pYcpY20QaE8",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.RHOMBOIDS),
        instructions = "Place one hand on a bench, pull the dumbbell towards your waist while keeping your back straight."
    ),
    Exercise(
        name = "Seated Cable Row",
        equipmentUsed = 17, // Cable Row Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=GZbfZ033f74",
        muscles = listOf(BodyPart.BACK, BodyPart.RHOMBOIDS, BodyPart.LATS),
        instructions = "Sit at a cable row machine, pull the handle toward your waist while keeping a straight back."
    ),
    Exercise(
        name = "Lat Pulldown",
        equipmentUsed = 19, // Lat Pulldown Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=CAwf7n6Luuc",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS),
        instructions = "Grip the bar wide, pull it down to your chest while engaging your lats."
    ),
    Exercise(
        name = "T-Bar Row",
        equipmentUsed = 44, // Landmine Attachment
        youtubeTutorial = "https://www.youtube.com/watch?v=G8Qvwi9T4Uw",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.RHOMBOIDS),
        instructions = "Stand over a barbell in a landmine attachment and row it towards your torso."
    ),
    Exercise(
        name = "Chest-Supported Row",
        equipmentUsed = 20, // Chest-Supported Row Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=6TSP1TRMUzs",
        muscles = listOf(BodyPart.BACK, BodyPart.RHOMBOIDS, BodyPart.LATS),
        instructions = "Lie chest-down on an incline bench and row dumbbells towards your chest."
    ),
    Exercise(
        name = "Inverted Row",
        equipmentUsed = 18, // Pull-Up Bar or Smith Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=Kt7JJHaj9kc",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.RHOMBOIDS),
        instructions = "Grip a bar with feet on the ground and pull your chest towards the bar."
    ),
    Exercise(
        name = "Face Pull",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=rep-qVOkqgk",
        muscles = listOf(BodyPart.BACK, BodyPart.TRAPS, BodyPart.REAR_DELTS),
        instructions = "Use a rope attachment, pull towards your face while squeezing the shoulder blades."
    ),
    Exercise(
        name = "Reverse Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ZqtWWVx2YBM",
        muscles = listOf(BodyPart.BACK, BodyPart.REAR_DELTS, BodyPart.RHOMBOIDS),
        instructions = "Bend forward and raise dumbbells outward in a controlled motion."
    ),
    Exercise(
        name = "Shrugs",
        equipmentUsed = 1, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=LuJ4hbkLiY0",
        muscles = listOf(BodyPart.BACK, BodyPart.TRAPS),
        instructions = "Hold weights at your sides, shrug your shoulders as high as possible."
    ),
    Exercise(
        name = "Good Mornings",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=vKPGe8zb2S4",
        muscles = listOf(BodyPart.BACK, BodyPart.ERECTOR_SPINAE, BodyPart.HAMSTRINGS),
        instructions = "With a barbell on your back, hinge forward while keeping your back straight."
    ),
    Exercise(
        name = "Superman Hold",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=cc6UVRS7PW4",
        muscles = listOf(BodyPart.BACK, BodyPart.ERECTOR_SPINAE),
        instructions = "Lie face down, raise your arms and legs off the floor, and hold."
    ),
    Exercise(
        name = "Hyperextensions",
        equipmentUsed = 23, // Hyperextension Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=ph3pddpKzzw",
        muscles = listOf(BodyPart.BACK, BodyPart.ERECTOR_SPINAE),
        instructions = "Lie face down on a hyperextension bench, lower and raise your torso."
    ),
    Exercise(
        name = "Dead Hang",
        equipmentUsed = 18, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=V93P6f2V4Cw",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS),
        instructions = "Hang from a bar with arms extended to decompress the spine."
    ),
    Exercise(
        name = "Kroc Rows",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=1zCr9QxZ5g4",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.RHOMBOIDS),
        instructions = "Perform single-arm dumbbell rows with heavy weight and controlled momentum."
    ),
    Exercise(
        name = "Yates Row",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=icfewcKm2lU",
        muscles = listOf(BodyPart.BACK, BodyPart.LATS, BodyPart.RHOMBOIDS),
        instructions = "Perform bent-over rows with an underhand grip for better lat activation."
    )
)
val frontDeltExercises = listOf(
    Exercise(
        name = "Barbell Overhead Press (Military Press)",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=2yjwXTZQDDI",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Stand with a barbell at shoulder height and press it overhead while keeping your core engaged."
    ),
    Exercise(
        name = "Seated Dumbbell Shoulder Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=qEwKCR5JCog",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Sit upright and press dumbbells overhead while keeping control of the movement."
    ),
    Exercise(
        name = "Arnold Press",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=3ml7BH7mNwQ",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Start with palms facing towards you and rotate them outward as you press up."
    ),
    Exercise(
        name = "Standing Dumbbell Front Raise",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=-t7fuZ0KhDA",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS),
        instructions = "Lift dumbbells in front of you to shoulder height with controlled motion."
    ),
    Exercise(
        name = "Cable Front Raise",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=vZ2F7dw6F8w",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS),
        instructions = "Use a cable handle and lift it straight in front of you to shoulder height."
    ),
    Exercise(
        name = "Landmine Press",
        equipmentUsed = 44, // Landmine Attachment
        youtubeTutorial = "https://www.youtube.com/watch?v=0LLO7lG6Rkg",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Press a barbell anchored in a landmine attachment upward in a controlled motion."
    ),
    Exercise(
        name = "Smith Machine Shoulder Press",
        equipmentUsed = 9, // Smith Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=j1ZYLCpo0u4",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Press the bar upwards in a controlled motion using the Smith machine."
    ),
    Exercise(
        name = "Incline Bench Press (Front Delt Focus)",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=SrqOu55lrYU",
        muscles = listOf(BodyPart.CHEST, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Perform an incline bench press to engage the front delts along with the upper chest."
    ),
    Exercise(
        name = "Close-Grip Barbell Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=G5Ar9jcpbF8",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Use a close grip on the barbell to emphasize front delts while pressing overhead."
    ),
    Exercise(
        name = "Plate Front Raise",
        equipmentUsed = 3, // Weight Plate
        youtubeTutorial = "https://www.youtube.com/watch?v=5Uqdx7YOgJg",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS),
        instructions = "Hold a weight plate and lift it straight in front of you to shoulder height."
    ),
    Exercise(
        name = "Pike Push-Ups",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=ruX8oCmcU4g",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Perform a push-up with your hips raised to target the front delts."
    ),
    Exercise(
        name = "Handstand Push-Ups",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=BqgCFmF7oKg",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.FRONT_DELTS, BodyPart.TRICEPS),
        instructions = "Perform push-ups while in a handstand position against a wall."
    )
)
val sideDeltExercises = listOf(
    Exercise(
        name = "Dumbbell Lateral Raise",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=3VcKaXpzqRo",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Raise the dumbbells to the sides until they reach shoulder height, keeping a slight bend in the elbows."
    ),
    Exercise(
        name = "Cable Lateral Raise",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=1SU2h5MphJw",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Use a cable to raise your arm laterally, keeping tension on the side delts throughout."
    ),
    Exercise(
        name = "Seated Dumbbell Lateral Raise",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=mrV4vCot-QI",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Perform lateral raises while seated to minimize momentum and better isolate the side delts."
    ),
    Exercise(
        name = "Machine Lateral Raise",
        equipmentUsed = 11, // Shoulder Lateral Raise Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=5rwdfmCEv0A",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Use the lateral raise machine to keep constant tension on the side delts."
    ),
    Exercise(
        name = "Cable Y-Raise",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=dzYcHE5jkm8",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS, BodyPart.TRAPS),
        instructions = "Raise the cable handles diagonally into a 'Y' shape for balanced shoulder development."
    ),
    Exercise(
        name = "Barbell Upright Row",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=AzfSOrmIFbE",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS, BodyPart.TRAPS),
        instructions = "Pull the barbell up close to your body until it reaches chest height, leading with your elbows."
    ),
    Exercise(
        name = "Dumbbell Upright Row",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=9rj2ECvkkgA",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS, BodyPart.TRAPS),
        instructions = "Pull dumbbells upward while keeping them close to your body, engaging the side delts."
    ),
    Exercise(
        name = "Leaning Cable Lateral Raise",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=onAhtO8qso8",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Lean to the side while performing a cable lateral raise for an increased range of motion."
    ),
    Exercise(
        name = "Behind-the-Back Cable Lateral Raise",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=cKLQ-PXAvpE",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Stand sideways to a cable machine and pull the handle behind your back to isolate the side delts."
    ),
    Exercise(
        name = "Cheat Lateral Raise (Slow Negative)",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ynN6XvOvEqI",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Use slight momentum to lift the dumbbells, then control the lowering phase for increased time under tension."
    ),
    Exercise(
        name = "Single-Arm Dumbbell Lateral Raise",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=xmTfekBfOD8",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Perform lateral raises one arm at a time to better focus on muscle activation."
    ),
    Exercise(
        name = "Incline Dumbbell Lateral Raise",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=FdmJ_n8BVCU",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.SIDE_DELTS),
        instructions = "Lie chest-down on an incline bench and perform lateral raises for a unique angle of resistance."
    )
)
val rearDeltExercises = listOf(
    Exercise(
        name = "Dumbbell Reverse Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Hxa8wzGtiW4",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Bend over slightly and raise the dumbbells outward like wings, squeezing the rear delts at the top."
    ),
    Exercise(
        name = "Cable Reverse Fly",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=K91dX8N5seo",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Use a cable machine to pull the handles outward, focusing on a controlled squeeze."
    ),
    Exercise(
        name = "Face Pulls",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=rep-qVOkqgk",
        muscles = listOf(
            BodyPart.SHOULDERS,
            BodyPart.REAR_DELTS,
            BodyPart.TRAPS,
            BodyPart.UPPER_BACK
        ),
        instructions = "Use a rope attachment and pull the cables towards your face, leading with your elbows."
    ),
    Exercise(
        name = "Bent-Over Rear Delt Row",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=kDqklk1ZESo",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Row dumbbells with elbows flared to emphasize the rear delts."
    ),
    Exercise(
        name = "Reverse Pec Deck Fly",
        equipmentUsed = 13, // Pec Deck Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=HsW9o6h9aE0",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Use a pec deck machine in reverse, pulling arms outward to engage rear delts."
    ),
    Exercise(
        name = "Seated Dumbbell Rear Delt Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=1nJ6IQBvFUI",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Sit on a bench, lean forward, and perform rear delt flys with dumbbells."
    ),
    Exercise(
        name = "Cable Rope Rear Delt Pull",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=Y5rA6F3pI9g",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Use a rope attachment and pull it apart while squeezing the rear delts."
    ),
    Exercise(
        name = "Barbell Rear Delt Row",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=Z3qK5f8z9nI",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS, BodyPart.UPPER_BACK),
        instructions = "Perform a row with a wide grip and pull towards your chest, emphasizing rear delts."
    ),
    Exercise(
        name = "Incline Bench Rear Delt Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=O6JxXAW2Xf8",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS),
        instructions = "Lie chest-down on an incline bench and perform rear delt flys with dumbbells."
    ),
    Exercise(
        name = "Lying Reverse Fly",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=bS9OqiwEdtE",
        muscles = listOf(BodyPart.SHOULDERS, BodyPart.REAR_DELTS),
        instructions = "Lie flat on a bench and perform rear delt flys to target the rear deltoid in a stable position."
    )
)
val bicepsExercises = listOf(
    Exercise(
        name = "Barbell Bicep Curl",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=kwG2ipFRgfo",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Grip the barbell with an underhand grip and curl the weight up while keeping your elbows stationary."
    ),
    Exercise(
        name = "Dumbbell Bicep Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ykJmrZ5v0Oo",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Hold dumbbells with palms facing up and curl them towards your shoulders in a controlled motion."
    ),
    Exercise(
        name = "Hammer Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=TwD-YGVP4Bk",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.FOREARMS),
        instructions = "Hold dumbbells with a neutral grip (palms facing inward) and curl them up."
    ),
    Exercise(
        name = "Preacher Curl",
        equipmentUsed = 9, // Preacher Curl Bench + Barbell or Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=34Xo6JQzBCA",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Use a preacher bench to rest your arms and isolate the biceps during the curl."
    ),
    Exercise(
        name = "Incline Dumbbell Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=sAq_ocpRh_I",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Lie on an incline bench and curl the dumbbells while keeping your elbows stationary."
    ),
    Exercise(
        name = "Concentration Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=1C9V2ZAYvYw",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Sit down, rest your elbow against your inner thigh, and curl the dumbbell up for full bicep contraction."
    ),
    Exercise(
        name = "Cable Bicep Curl",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=5_JnwM4OD6M",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Attach a bar to a cable machine and curl the weight up while keeping tension on the biceps."
    ),
    Exercise(
        name = "EZ Bar Curl",
        equipmentUsed = 1, // EZ Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=wVGHsrKDSUU",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Use an EZ bar to reduce wrist strain while performing a bicep curl."
    ),
    Exercise(
        name = "Reverse Curl",
        equipmentUsed = 1, // Barbell or EZ Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=9JqvL3r6N4A",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.FOREARMS),
        instructions = "Use an overhand grip and curl the barbell up to target the brachialis and forearms."
    ),
    Exercise(
        name = "Zottman Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ykJmrZ5v0Oo",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.FOREARMS),
        instructions = "Curl the dumbbells up with palms facing up, then rotate palms down on the way down."
    ),
    Exercise(
        name = "Spider Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=sX0S6BF7rco",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Lie chest-down on an incline bench and curl the dumbbells, ensuring full bicep contraction."
    ),
    Exercise(
        name = "Single-Arm Cable Curl",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=lAocE-aK2Kc",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS),
        instructions = "Perform bicep curls using a single-arm cable attachment for constant tension."
    ),
    Exercise(
        name = "Chin-Ups (Biceps Focused)",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=xrbqBvHgD0Y",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.BACK),
        instructions = "Use an underhand grip and pull your body up while emphasizing bicep engagement."
    )
)
val tricepsExercises = listOf(
    Exercise(
        name = "Close-Grip Bench Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=1F2XQLnYI-Y",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS, BodyPart.CHEST),
        instructions = "Use a close grip on the barbell and press upwards while keeping elbows tucked."
    ),
    Exercise(
        name = "Dips",
        equipmentUsed = 7, // Dip Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=0326dy_-CzM",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS, BodyPart.CHEST),
        instructions = "Lower your body by bending your elbows, then push up focusing on triceps engagement."
    ),
    Exercise(
        name = "Skull Crushers",
        equipmentUsed = 1, // EZ Bar / Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=d_KZxkY_0cM",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Lie on a bench and lower the bar towards your forehead before extending your arms back up."
    ),
    Exercise(
        name = "Overhead Dumbbell Triceps Extension",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=YbX7Wd8jQ-Q",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Hold a dumbbell with both hands overhead and extend your arms fully."
    ),
    Exercise(
        name = "Rope Triceps Pushdown",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=vB5OHsJ3EME",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Pull the rope down while keeping elbows tight to your sides."
    ),
    Exercise(
        name = "Straight Bar Triceps Pushdown",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=2-LAMcpzODU",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Use a straight bar to push down and extend your arms fully."
    ),
    Exercise(
        name = "Dumbbell Kickbacks",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ZO81bExngMI",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Lean forward and extend your arms backward, squeezing the triceps."
    ),
    Exercise(
        name = "Lying Dumbbell Triceps Extension",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=j8QH-OyI9Tg",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Similar to skull crushers but with dumbbells for better range of motion."
    ),
    Exercise(
        name = "Close-Grip Push-Ups",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=I6kL60YBFM8",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS, BodyPart.CHEST),
        instructions = "Perform push-ups with hands close together to emphasize triceps."
    ),
    Exercise(
        name = "Reverse Grip Triceps Pushdown",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=HkGypAZdn_4",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Use an underhand grip on a cable machine and push down for better medial head activation."
    ),
    Exercise(
        name = "Single-Arm Cable Triceps Pushdown",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=WFqnc6EuoK8",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Use one arm at a time to isolate each tricep."
    ),
    Exercise(
        name = "Triceps Bench Dip",
        equipmentUsed = 6, // Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=6kALZikXxLc",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Use a bench to support your body and dip down to engage triceps."
    ),
    Exercise(
        name = "Machine Triceps Dips",
        equipmentUsed = 14, // Assisted Dip Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=XHUnYH3Ugrw",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS, BodyPart.CHEST),
        instructions = "Use a dip machine for controlled triceps activation."
    ),
    Exercise(
        name = "Close-Grip Smith Machine Press",
        equipmentUsed = 10, // Smith Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=JaDqR4NBn8o",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS, BodyPart.CHEST),
        instructions = "Perform a close-grip press using a Smith machine for stability."
    ),
    Exercise(
        name = "JM Press",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=_wH2lC9G-u0",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "A combination of a close-grip bench press and skull crusher for triceps growth."
    ),
    Exercise(
        name = "Diamond Push-Ups",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=J0DnG1_S92I",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS, BodyPart.CHEST),
        instructions = "Perform push-ups with hands in a diamond shape to target the triceps."
    ),
    Exercise(
        name = "Overhead Cable Triceps Extension",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=d_KZxkY_0cM",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Stand facing away from the cable machine and extend your arms overhead."
    ),
    Exercise(
        name = "Band Triceps Pressdown",
        equipmentUsed = 17, // Resistance Band
        youtubeTutorial = "https://www.youtube.com/watch?v=c07ldoU72uU",
        muscles = listOf(BodyPart.ARMS, BodyPart.TRICEPS),
        instructions = "Use a resistance band to mimic a cable pushdown for home workouts."
    )
)
val forearmExercises = listOf(
    Exercise(
        name = "Wrist Curls",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=mzXjFPTb0Hc",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Hold a barbell with an underhand grip and curl your wrists upwards."
    ),
    Exercise(
        name = "Reverse Wrist Curls",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=pvJFSu6GRgs",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Hold a barbell with an overhand grip and extend your wrists upwards."
    ),
    Exercise(
        name = "Dumbbell Wrist Curls",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=FhVC1YvMM8I",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Sit with your arms resting on your thighs and curl the dumbbell with your wrist."
    ),
    Exercise(
        name = "Dumbbell Reverse Wrist Curls",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=xHA3yqOg7Q0",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Perform wrist curls with an overhand grip to target wrist extensors."
    ),
    Exercise(
        name = "Farmer's Walk",
        equipmentUsed = 2, // Dumbbell or Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=GuBauzMLdfQ",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS, BodyPart.TRAPS),
        instructions = "Walk while holding heavy dumbbells to improve grip strength."
    ),
    Exercise(
        name = "Dead Hangs",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=RC4PlKuWOgY",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS, BodyPart.BACK),
        instructions = "Hang from a pull-up bar for as long as possible to build grip endurance."
    ),
    Exercise(
        name = "Reverse Barbell Curls",
        equipmentUsed = 1, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=9JqvL3r6N4A",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.FOREARMS),
        instructions = "Use an overhand grip on a barbell and curl it upwards."
    ),
    Exercise(
        name = "Hammer Curls",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=TwD-YGVP4Bk",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.FOREARMS),
        instructions = "Perform curls with a neutral grip to target the brachialis and forearms."
    ),
    Exercise(
        name = "Plate Pinch Hold",
        equipmentUsed = 5, // Weight Plate
        youtubeTutorial = "https://www.youtube.com/watch?v=xX2k2UVEKcg",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Pinch a weight plate between your fingers and hold for grip endurance."
    ),
    Exercise(
        name = "Towel Grip Pull-Ups",
        equipmentUsed = 8, // Pull-Up Bar + Towel
        youtubeTutorial = "https://www.youtube.com/watch?v=SPbToHeJpSg",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS, BodyPart.BACK),
        instructions = "Wrap a towel over a pull-up bar and perform pull-ups to build grip strength."
    ),
    Exercise(
        name = "Wrist Roller",
        equipmentUsed = 11, // Wrist Roller
        youtubeTutorial = "https://www.youtube.com/watch?v=qM0ojEIGbfM",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Roll a weighted bar up and down using only your wrists."
    ),
    Exercise(
        name = "Finger Curls",
        equipmentUsed = 1, // Barbell or Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=q5QXtfX6Mbk",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Hold a barbell with your fingertips and curl it up to strengthen grip."
    ),
    Exercise(
        name = "Zottman Curl",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=ykJmrZ5v0Oo",
        muscles = listOf(BodyPart.ARMS, BodyPart.BICEPS, BodyPart.FOREARMS),
        instructions = "Curl with palms up, then lower with palms facing down."
    ),
    Exercise(
        name = "Kettlebell Bottoms-Up Press",
        equipmentUsed = 4, // Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=kk6PrY-pDh4",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Hold a kettlebell upside down and press it overhead to improve wrist stability."
    ),
    Exercise(
        name = "Sledgehammer Tire Slams",
        equipmentUsed = 15, // Sledgehammer + Tire
        youtubeTutorial = "https://www.youtube.com/watch?v=BbY57AAzAxw",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS, BodyPart.CORE),
        instructions = "Swing a sledgehammer onto a tire to develop explosive grip strength."
    ),
    Exercise(
        name = "Grip Trainer Squeezes",
        equipmentUsed = 18, // Grip Trainer
        youtubeTutorial = "https://www.youtube.com/watch?v=GqwwYpx-7z8",
        muscles = listOf(BodyPart.ARMS, BodyPart.FOREARMS),
        instructions = "Use a hand gripper to strengthen finger and wrist grip."
    )
)
val coreExercises = listOf(
    Exercise(
        name = "Hanging Leg Raises",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=JB2oyawG9KI",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS, BodyPart.LOWER_BACK),
        instructions = "Hang from a bar and raise your legs to 90° while keeping your core engaged."
    ),
    Exercise(
        name = "Toes to Bar",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=hrnNQloNVhM",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Bring your toes up to touch the pull-up bar while keeping your legs straight."
    ),
    Exercise(
        name = "Cable Woodchoppers",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=GxvUPgO0P3M",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Pull the cable diagonally across your body to engage the obliques."
    ),
    Exercise(
        name = "Russian Twists",
        equipmentUsed = 2, // Dumbbell or Medicine Ball
        youtubeTutorial = "https://www.youtube.com/watch?v=wkD8rjkodUI",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Sit with feet off the ground and twist your torso side to side while holding weight."
    ),
    Exercise(
        name = "Plank",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=BQu26ABuVS0",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS, BodyPart.LOWER_BACK),
        instructions = "Hold a straight body position on your forearms and toes, keeping your core tight."
    ),
    Exercise(
        name = "Side Plank",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=wqzrb67Dwf8",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hold a plank position on one side, engaging the obliques."
    ),
    Exercise(
        name = "Ab Wheel Rollouts",
        equipmentUsed = 12, // Ab Wheel
        youtubeTutorial = "https://www.youtube.com/watch?v=JJrgJotTbYk",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Roll the ab wheel forward while keeping your core tight and preventing lower back arch."
    ),
    Exercise(
        name = "Hanging Knee Raises",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=u5SNAv3aMfk",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Hang from a bar and raise your knees towards your chest."
    ),
    Exercise(
        name = "L-Sit",
        equipmentUsed = 7, // Dip Bars or Floor
        youtubeTutorial = "https://www.youtube.com/watch?v=tVA1j0Z0EXo",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS, BodyPart.LOWER_BACK),
        instructions = "Hold your legs straight in front of you while supporting your body weight."
    ),
    Exercise(
        name = "V-Ups",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=iP2fjvG0g3w",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back and lift your arms and legs simultaneously to meet in the middle."
    ),
    Exercise(
        name = "Dragon Flags",
        equipmentUsed = 6, // Bench or Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=gMaB-fG4u4g",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS, BodyPart.LOWER_BACK),
        instructions = "Hold onto a bench and lift your legs while keeping your body straight."
    ),
    Exercise(
        name = "Bicycle Crunches",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=9FGilxCbdz8",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Lie on your back and perform a cycling motion while twisting your torso."
    ),
    Exercise(
        name = "Decline Sit-Ups",
        equipmentUsed = 6, // Decline Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=Xyd_fa5zoEU",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Perform sit-ups on a decline bench for increased difficulty."
    ),
    Exercise(
        name = "Hollow Body Hold",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=nQ8A-T4q3Xc",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back with arms and legs raised slightly, maintaining tension in the core."
    ),
    Exercise(
        name = "Standing Cable Crunches",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=tC1Il5rdQD8",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Use a cable rope to crunch downwards while keeping your core engaged."
    ),
    Exercise(
        name = "Flutter Kicks",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=ANVdMDaYRts",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back and kick your legs up and down in small rapid movements."
    ),
    Exercise(
        name = "Turkish Get-Up",
        equipmentUsed = 2, // Dumbbell or Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=u95NktP0Jc0",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS, BodyPart.LOWER_BACK),
        instructions = "Move from a lying position to a standing position while holding a weight overhead."
    ),
    Exercise(
        name = "Superman Hold",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=cc6UVRS7PW4",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lie on your stomach and lift your arms and legs simultaneously."
    )
)
val absExercises = listOf(
    Exercise(
        name = "Crunches",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=Xyd_fa5zoEU",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back with knees bent and crunch your torso towards your knees."
    ),
    Exercise(
        name = "Hanging Leg Raises",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=JB2oyawG9KI",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Hang from a bar and lift your legs up to engage your lower abs."
    ),
    Exercise(
        name = "Toes to Bar",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=hrnNQloNVhM",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Bring your toes up to touch the pull-up bar while keeping your legs straight."
    ),
    Exercise(
        name = "Bicycle Crunches",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=9FGilxCbdz8",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back and perform a cycling motion while twisting your torso."
    ),
    Exercise(
        name = "V-Ups",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=iP2fjvG0g3w",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back and lift your arms and legs simultaneously to meet in the middle."
    ),
    Exercise(
        name = "Ab Wheel Rollouts",
        equipmentUsed = 12, // Ab Wheel
        youtubeTutorial = "https://www.youtube.com/watch?v=JJrgJotTbYk",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Roll the ab wheel forward while keeping your core tight."
    ),
    Exercise(
        name = "Plank",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=BQu26ABuVS0",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Hold a straight body position on your forearms and toes, keeping your core engaged."
    ),
    Exercise(
        name = "Flutter Kicks",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=ANVdMDaYRts",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back and kick your legs up and down in small rapid movements."
    ),
    Exercise(
        name = "Decline Sit-Ups",
        equipmentUsed = 6, // Decline Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=Xyd_fa5zoEU",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Perform sit-ups on a decline bench for increased difficulty."
    ),
    Exercise(
        name = "Cable Crunches",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=tC1Il5rdQD8",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Use a cable rope to crunch downwards while keeping your core engaged."
    ),
    Exercise(
        name = "Hollow Body Hold",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=nQ8A-T4q3Xc",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back with arms and legs raised slightly, maintaining tension in the core."
    ),
    Exercise(
        name = "Dragon Flags",
        equipmentUsed = 6, // Bench or Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=gMaB-fG4u4g",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Hold onto a bench and lift your legs while keeping your body straight."
    ),
    Exercise(
        name = "Standing Cable Crunches",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=tC1Il5rdQD8",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Use a cable rope to crunch downwards while keeping your core engaged."
    ),
    Exercise(
        name = "Hanging Knee Raises",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=u5SNAv3aMfk",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Hang from a bar and raise your knees towards your chest."
    ),
    Exercise(
        name = "Sit-Ups with Medicine Ball Throw",
        equipmentUsed = 3, // Medicine Ball
        youtubeTutorial = "https://www.youtube.com/watch?v=Y1g3wA-M1Z0",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Perform sit-ups while throwing and catching a medicine ball."
    ),
    Exercise(
        name = "Dead Bug",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=4CzO2FC6-KA",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Lie on your back and move opposite arm and leg while keeping your core tight."
    ),
    Exercise(
        name = "Leg Raises on Dip Bar",
        equipmentUsed = 7, // Dip Bars
        youtubeTutorial = "https://www.youtube.com/watch?v=g8pKstczlBI",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Hold onto parallel bars and raise your legs to engage your abs."
    ),
    Exercise(
        name = "Turkish Get-Up",
        equipmentUsed = 2, // Dumbbell or Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=u95NktP0Jc0",
        muscles = listOf(BodyPart.CORE, BodyPart.ABS),
        instructions = "Move from a lying position to a standing position while holding a weight overhead."
    )
)
val obliqueExercises = listOf(
    Exercise(
        name = "Cable Woodchoppers",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=GxvUPgO0P3M",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Pull the cable diagonally across your body to engage the obliques."
    ),
    Exercise(
        name = "Russian Twists",
        equipmentUsed = 3, // Medicine Ball or Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=wkD8rjkodUI",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Sit with feet off the ground and twist your torso side to side while holding weight."
    ),
    Exercise(
        name = "Hanging Oblique Knee Raises",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=jEAcvHbk8pc",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hang from a bar and bring your knees up to the side to target obliques."
    ),
    Exercise(
        name = "Side Plank",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=wqzrb67Dwf8",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hold a plank position on one side, engaging the obliques."
    ),
    Exercise(
        name = "Bicycle Crunches",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=9FGilxCbdz8",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Lie on your back and perform a cycling motion while twisting your torso."
    ),
    Exercise(
        name = "Standing Cable Twists",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=20sAF3jEq2Q",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Stand sideways to the cable machine and twist your torso against resistance."
    ),
    Exercise(
        name = "Seated Barbell Twists",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=8Mxa_BrNYDk",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hold a barbell behind your neck and twist side to side."
    ),
    Exercise(
        name = "Windshield Wipers",
        equipmentUsed = 6, // Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=UdiNv2_UJuY",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Lie on a bench and move your legs side to side like windshield wipers."
    ),
    Exercise(
        name = "Landmine Twists",
        equipmentUsed = 17, // Landmine Attachment
        youtubeTutorial = "https://www.youtube.com/watch?v=I94gyHqHRJ4",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hold a landmine barbell and rotate side to side."
    ),
    Exercise(
        name = "Dumbbell Side Bends",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=2h-3EeSNuZQ",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hold a dumbbell in one hand and bend sideways to stretch and contract the obliques."
    ),
    Exercise(
        name = "Plank Hip Dips",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=4J1MGdP1AOk",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "In a plank position, rotate your hips side to side to engage the obliques."
    ),
    Exercise(
        name = "Decline Russian Twists",
        equipmentUsed = 6, // Decline Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=VZokEufT3dA",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Perform Russian Twists while seated on a decline bench."
    ),
    Exercise(
        name = "Side-Lying Leg Raises",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=rM8nxmW73Bs",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Lie on your side and raise your legs upward, engaging the obliques."
    ),
    Exercise(
        name = "Hanging Windshield Wipers",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=YpM_hZz9e_E",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Hang from a bar and move your legs side to side in a controlled motion."
    ),
    Exercise(
        name = "Medicine Ball Side Throws",
        equipmentUsed = 3, // Medicine Ball
        youtubeTutorial = "https://www.youtube.com/watch?v=5SAwW5E39Fg",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Throw a medicine ball sideways against a wall for explosive rotational power."
    ),
    Exercise(
        name = "Lateral Leg Raises",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=UQ2fZIHlxmA",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Lie on your side and lift your leg to target the obliques."
    ),
    Exercise(
        name = "Sledgehammer Slams",
        equipmentUsed = 18, // Sledgehammer & Tire
        youtubeTutorial = "https://www.youtube.com/watch?v=aCU0O0Oftlc",
        muscles = listOf(BodyPart.CORE, BodyPart.OBLIQUES),
        instructions = "Swing a sledgehammer onto a tire, engaging obliques with each rotation."
    )
)
val lowerBackExercises = listOf(
    Exercise(
        name = "Deadlifts",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=op9kVnSso6Q",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lift a barbell from the floor while maintaining a straight back and engaging the lower back."
    ),
    Exercise(
        name = "Romanian Deadlifts",
        equipmentUsed = 5, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=5WMPoF3xyH0",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lower the barbell with a slight knee bend, stretching the hamstrings and lower back."
    ),
    Exercise(
        name = "Hyperextensions (Back Extensions)",
        equipmentUsed = 9, // Hyperextension Bench
        youtubeTutorial = "https://www.youtube.com/watch?v=ph3pddpKzzw",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Bend at the waist and extend your back to strengthen the lower back."
    ),
    Exercise(
        name = "Good Mornings",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=vKPGe8zb2S8",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Hinge at the hips while keeping a straight back, then return to the starting position."
    ),
    Exercise(
        name = "Rack Pulls",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=F_M3yJZjLXA",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Perform a partial deadlift from knee height to overload the lower back."
    ),
    Exercise(
        name = "Superman Hold",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=cc6UVRS7PW4",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lie on your stomach and lift your arms and legs simultaneously, engaging the lower back."
    ),
    Exercise(
        name = "Kettlebell Swings",
        equipmentUsed = 4, // Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=YSxHifyI4Kk",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Swing a kettlebell using a hip hinge motion while keeping the lower back engaged."
    ),
    Exercise(
        name = "Bridges (Hip Thrusts)",
        equipmentUsed = 0, // Bodyweight or Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=4qBoy87dKEM",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lie on your back and lift your hips upward to activate the lower back and glutes."
    ),
    Exercise(
        name = "Bird Dog",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=wiFNA3sqjCA",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Extend opposite arm and leg while maintaining a neutral spine."
    ),
    Exercise(
        name = "Reverse Hyperextensions",
        equipmentUsed = 9, // Reverse Hyper Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=bFhd1MjpKCE",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lie face down and raise your legs to engage the lower back."
    ),
    Exercise(
        name = "Single-Leg Romanian Deadlifts",
        equipmentUsed = 2, // Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=dNfJ1tP4M2Y",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Balance on one leg while performing a Romanian Deadlift motion."
    ),
    Exercise(
        name = "Seated Back Extensions",
        equipmentUsed = 10, // Back Extension Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=H8mkwXbAsD8",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Use a machine to extend your back in a seated position."
    ),
    Exercise(
        name = "Dead Hangs",
        equipmentUsed = 8, // Pull-Up Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=ix0M5lt_gMI",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Hang from a pull-up bar to decompress the spine and engage the lower back."
    ),
    Exercise(
        name = "Jefferson Curl",
        equipmentUsed = 5, // Barbell or Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=qM2lB9i3fKc",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Roll your spine downward while holding a weight to improve lower back flexibility."
    ),
    Exercise(
        name = "Quadruped Thoracic Rotations",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=bbENXCrHy28",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Rotate your torso while on all fours to improve lower back mobility."
    ),
    Exercise(
        name = "Farmer’s Carry",
        equipmentUsed = 2, // Dumbbells or Kettlebells
        youtubeTutorial = "https://www.youtube.com/watch?v=H22BY8i0ig8",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Walk while holding heavy weights to strengthen the lower back."
    ),
    Exercise(
        name = "Y-Raises on Incline Bench",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=XFsMP6WnH8Q",
        muscles = listOf(BodyPart.CORE, BodyPart.LOWER_BACK),
        instructions = "Lie face down on an incline bench and raise your arms in a 'Y' shape."
    )
)
val gluteExercises = listOf(
    Exercise(
        name = "Barbell Hip Thrusts",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=9eg5vWE5CM0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Place your upper back against a bench, thrust hips upward with a barbell on your hips."
    ),
    Exercise(
        name = "Romanian Deadlifts",
        equipmentUsed = 5, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=5WMPoF3xyH0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Lower the barbell while maintaining a straight back, stretching the hamstrings and glutes."
    ),
    Exercise(
        name = "Bulgarian Split Squats",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=kuWkywFFQhQ",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Elevate one foot behind you on a bench and perform a lunge."
    ),
    Exercise(
        name = "Glute Bridges",
        equipmentUsed = 0, // Bodyweight or Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=F8Ao5SCX4XI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Lie on your back, push through heels, and raise hips upward."
    ),
    Exercise(
        name = "Cable Kickbacks",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=SHBAIeH9o3E",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Attach an ankle strap and extend one leg backward against resistance."
    ),
    Exercise(
        name = "Step-Ups",
        equipmentUsed = 2, // Dumbbells or Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=mrXlS7q9p-8",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Step onto a box, pushing through the heel to activate the glutes."
    ),
    Exercise(
        name = "Sumo Deadlifts",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=zF7ujgSrmMw",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Take a wide stance and lift the barbell with an upright torso."
    ),
    Exercise(
        name = "Frog Pumps",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=mL7xMZSVFtE",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Lie on your back with feet together and thrust hips upward."
    ),
    Exercise(
        name = "Seated Hip Abductions",
        equipmentUsed = 11, // Hip Abduction Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=ETv27PnnDck",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Push thighs outward against resistance on the hip abduction machine."
    ),
    Exercise(
        name = "Reverse Lunges",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=V7blgpavXic",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Step backward into a lunge position while keeping the weight on the front leg."
    ),
    Exercise(
        name = "Cable Pull-Throughs",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=lro2T26aw8A",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Face away from the cable machine and hinge at the hips while pulling the cable between your legs."
    ),
    Exercise(
        name = "Kettlebell Swings",
        equipmentUsed = 4, // Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=YSxHifyI4Kk",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Swing a kettlebell using a hip hinge motion to explosively activate the glutes."
    ),
    Exercise(
        name = "Donkey Kicks",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=-rtysuL2M8A",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "On all fours, kick one leg backward while squeezing the glutes."
    ),
    Exercise(
        name = "Single-Leg Glute Bridge",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=5y4XH0KIdUs",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Perform a glute bridge using one leg for increased activation."
    ),
    Exercise(
        name = "Side-Lying Clamshells",
        equipmentUsed = 0, // Bodyweight or Resistance Band
        youtubeTutorial = "https://www.youtube.com/watch?v=4nzjM3v4h60",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Lie on your side and open your legs in a clamshell motion."
    ),
    Exercise(
        name = "Landmine Squats",
        equipmentUsed = 17, // Landmine Attachment
        youtubeTutorial = "https://www.youtube.com/watch?v=zmqNX_oN8yM",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Hold a landmine barbell and squat deep to maximize glute activation."
    ),
    Exercise(
        name = "Hip Thrust Machine",
        equipmentUsed = 12, // Hip Thrust Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=ObWm7hC3kEI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.GLUTES),
        instructions = "Perform hip thrusts on a specialized machine for controlled resistance."
    )
)
val quadExercises = listOf(
    Exercise(
        name = "Barbell Back Squat",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=SW_C1A-rejs",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Squat with a barbell on your back, keeping your chest up and pushing through your heels."
    ),
    Exercise(
        name = "Front Squat",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=U5zrloYWwxw",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Hold the barbell in a front rack position and squat deeply for quad emphasis."
    ),
    Exercise(
        name = "Leg Press",
        equipmentUsed = 13, // Leg Press Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=IZxyjW7MPJQ",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Push against a weighted platform using your legs while keeping your back flat."
    ),
    Exercise(
        name = "Bulgarian Split Squat",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=kuWkywFFQhQ",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Elevate one foot behind you on a bench and perform a single-leg squat."
    ),
    Exercise(
        name = "Lunges",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=D7KaRcUTQeE",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Step forward into a lunge position, keeping the front knee aligned over the foot."
    ),
    Exercise(
        name = "Step-Ups",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=mrXlS7q9p-8",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Step onto a box, pushing through the heel to activate the quads."
    ),
    Exercise(
        name = "Hack Squat",
        equipmentUsed = 14, // Hack Squat Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=J3PXShKOQtQ",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Squat using a hack squat machine with your back against the pad."
    ),
    Exercise(
        name = "Leg Extensions",
        equipmentUsed = 15, // Leg Extension Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=YyvSfVjQeL0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Extend your legs against resistance on a leg extension machine."
    ),
    Exercise(
        name = "Sissy Squat",
        equipmentUsed = 0, // Bodyweight or Sissy Squat Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=VdUsVQKPFcI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Lean back while balancing on your toes and engage your quads throughout the movement."
    ),
    Exercise(
        name = "Cyclist Squats",
        equipmentUsed = 5, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=4-LV_TJT-kM",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Place heels on a wedge or plates to emphasize quad activation during squats."
    ),
    Exercise(
        name = "Wall Sit",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=-cdph8hv0O0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Hold a seated position against a wall to build quad endurance."
    ),
    Exercise(
        name = "Goblet Squat",
        equipmentUsed = 2, // Dumbbell or Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=MeIiIdhvXT4",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Hold a dumbbell in front of your chest and squat deeply."
    ),
    Exercise(
        name = "Heels Elevated Squats",
        equipmentUsed = 5, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=EOLtkG6d1Q8",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Elevate heels on a platform to shift more emphasis onto the quads."
    ),
    Exercise(
        name = "Trap Bar Deadlift (Quad Focus)",
        equipmentUsed = 6, // Trap Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=JR3hDmoY2mU",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Use a trap bar to perform a squat-like deadlift, engaging the quads."
    ),
    Exercise(
        name = "Short-Strided Walking Lunges",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=moW0rTun41U",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Take shorter lunge steps to emphasize quad activation."
    ),
    Exercise(
        name = "Leg Press (Feet Low and Close)",
        equipmentUsed = 13, // Leg Press Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=IZxyjW7MPJQ",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.QUADS),
        instructions = "Position feet low and close on the platform to maximize quad engagement."
    )
)
val hamstringExercises = listOf(
    Exercise(
        name = "Romanian Deadlifts",
        equipmentUsed = 5, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=5WMPoF3xyH0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Lower the barbell while maintaining a straight back, stretching the hamstrings."
    ),
    Exercise(
        name = "Seated Leg Curls",
        equipmentUsed = 18, // Seated Leg Curl Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=1Tq3QdYUuHs",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Sit on the machine and curl the weight down with your hamstrings."
    ),
    Exercise(
        name = "Lying Leg Curls",
        equipmentUsed = 19, // Lying Leg Curl Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=1Tq3QdYUuHs",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Lie face down and curl the weight towards your glutes."
    ),
    Exercise(
        name = "Nordic Hamstring Curls",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=8wUOFA2xYzI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Lower yourself slowly while keeping the hamstrings engaged."
    ),
    Exercise(
        name = "Good Mornings",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=vKPGe8zb2S4",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Hinge forward at the hips while keeping your back straight."
    ),
    Exercise(
        name = "Glute-Ham Raises",
        equipmentUsed = 20, // GHD Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=_LI1WQiG2G4",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Use a glute-ham developer to curl yourself upwards."
    ),
    Exercise(
        name = "Kettlebell Swings",
        equipmentUsed = 4, // Kettlebell
        youtubeTutorial = "https://www.youtube.com/watch?v=YSxHifyI4Kk",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Use a hip hinge motion to swing the kettlebell explosively."
    ),
    Exercise(
        name = "Sumo Deadlifts",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=zF7ujgSrmMw",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Take a wide stance and lift the barbell while engaging the hamstrings."
    ),
    Exercise(
        name = "Single-Leg Romanian Deadlifts",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=Rj8VKQFSTzI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Hinge at the hips while balancing on one leg."
    ),
    Exercise(
        name = "Step-Through Lunges",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=V7blgpavXic",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Step forward and backward in a lunge position for extra hamstring activation."
    ),
    Exercise(
        name = "Trap Bar Deadlift (Hamstring Focus)",
        equipmentUsed = 6, // Trap Bar
        youtubeTutorial = "https://www.youtube.com/watch?v=JR3hDmoY2mU",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Use a trap bar to perform a deadlift while engaging the hamstrings."
    ),
    Exercise(
        name = "Reverse Hyperextensions",
        equipmentUsed = 21, // Reverse Hyper Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=82vGhXcrGvc",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Extend your legs backward while lying face down on a reverse hyper machine."
    ),
    Exercise(
        name = "Swiss Ball Hamstring Curls",
        equipmentUsed = 22, // Stability Ball
        youtubeTutorial = "https://www.youtube.com/watch?v=OZhtaeq4lsE",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Lie on your back and curl the ball towards your glutes using your hamstrings."
    ),
    Exercise(
        name = "Cable Pull-Throughs",
        equipmentUsed = 16, // Cable Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=lro2T26aw8A",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Face away from the cable machine and hinge at the hips while pulling the cable."
    ),
    Exercise(
        name = "Heel Elevated Romanian Deadlifts",
        equipmentUsed = 5, // Barbell or Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=5WMPoF3xyH0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Place your heels on a small platform to increase hamstring stretch."
    ),
    Exercise(
        name = "Deficit Deadlifts",
        equipmentUsed = 5, // Barbell
        youtubeTutorial = "https://www.youtube.com/watch?v=g-gk5rTMCXI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Stand on a raised platform to increase hamstring range of motion."
    ),
    Exercise(
        name = "Standing Leg Curls",
        equipmentUsed = 23, // Standing Leg Curl Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=3H27Xzlv3Ps",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.HAMSTRINGS),
        instructions = "Curl your leg up while standing on a machine for isolated hamstring activation."
    )
)
val calfExercises = listOf(
    Exercise(
        name = "Standing Calf Raise",
        equipmentUsed = 24, // Standing Calf Raise Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=-M4-G8p8fmc",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Stand on the platform with your shoulders under the pads, raise your heels, and squeeze your calves at the top."
    ),
    Exercise(
        name = "Seated Calf Raise",
        equipmentUsed = 25, // Seated Calf Raise Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=ybqeHLohViM",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Sit on the machine, place the balls of your feet on the platform, and raise your heels to engage the soleus."
    ),
    Exercise(
        name = "Donkey Calf Raise",
        equipmentUsed = 26, // Donkey Calf Raise Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=bACxXGGeJ_Y",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Bend forward with your hips supported and perform calf raises with a full range of motion."
    ),
    Exercise(
        name = "Single-Leg Standing Calf Raise",
        equipmentUsed = 0, // Bodyweight or Dumbbell
        youtubeTutorial = "https://www.youtube.com/watch?v=2ZSTUosqKbs",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Perform calf raises on one leg for increased intensity and balance."
    ),
    Exercise(
        name = "Smith Machine Calf Raise",
        equipmentUsed = 27, // Smith Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=r8gA05zfs0I",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Use a Smith Machine for controlled calf raises with added weight."
    ),
    Exercise(
        name = "Leg Press Calf Raise",
        equipmentUsed = 13, // Leg Press Machine
        youtubeTutorial = "https://www.youtube.com/watch?v=O_Tw1FvUrXA",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Place your feet at the lower edge of the leg press platform and push through the balls of your feet."
    ),
    Exercise(
        name = "Jump Rope",
        equipmentUsed = 28, // Jump Rope
        youtubeTutorial = "https://www.youtube.com/watch?v=Gx03yDW0QTY",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Perform continuous jumping rope to improve calf endurance and explosiveness."
    ),
    Exercise(
        name = "Farmers Walk on Toes",
        equipmentUsed = 2, // Dumbbells
        youtubeTutorial = "https://www.youtube.com/watch?v=3tq2VKjZADw",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Walk on your toes while carrying heavy dumbbells to build calf strength."
    ),
    Exercise(
        name = "Tibialis Raises",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=0BWLKFYd8jQ",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Lean against a wall and lift your toes up while keeping your heels on the ground."
    ),
    Exercise(
        name = "Box Jumps",
        equipmentUsed = 29, // Plyo Box
        youtubeTutorial = "https://www.youtube.com/watch?v=52r_UaV9YKw",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Jump onto a box using explosive calf power."
    ),
    Exercise(
        name = "Heel Walks",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=SuIYL80_qyI",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Walk on your heels to strengthen the tibialis anterior and lower calves."
    ),
    Exercise(
        name = "Explosive Calf Jumps",
        equipmentUsed = 0, // Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=QUry3NRA2eM",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Jump as high as possible using only your calves."
    ),
    Exercise(
        name = "Step Up Calf Raises",
        equipmentUsed = 2, // Dumbbells or Bodyweight
        youtubeTutorial = "https://www.youtube.com/watch?v=mrXlS7q9p-8",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Step up onto a platform and perform a calf raise at the top."
    ),
    Exercise(
        name = "Sled Push",
        equipmentUsed = 30, // Sled
        youtubeTutorial = "https://www.youtube.com/watch?v=xEhN1DZp4H0",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Push a weighted sled forward to engage the calves dynamically."
    ),
    Exercise(
        name = "Incline Treadmill Walk",
        equipmentUsed = 31, // Treadmill
        youtubeTutorial = "https://www.youtube.com/watch?v=nJlVgGXlB2U",
        muscles = listOf(BodyPart.LOWER_BODY, BodyPart.CALVES),
        instructions = "Walk on an inclined treadmill to target the calves."
    )
)

val exercises = listOf(
    upperChestExercises,
    lowerChestExercises,
    frontDeltExercises,
    sideDeltExercises,
    rearDeltExercises,
    forearmExercises,
    coreExercises,
    lowerBackExercises,
    gluteExercises,
    quadExercises,
    hamstringExercises,
    calfExercises,
    bicepsExercises,
    backExercises,
    tricepsExercises,
    absExercises,
    obliqueExercises
).flatten()