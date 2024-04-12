package com.example.careersteps


  /*  object QuestionData {
        val questions: Any
            get() {
                TODO()
            }

        // Question 1
        const val QUESTION_1 = "What is your favorite subject?"
        val OPTIONS_1 = listOf("Mathematics", "Science", "History", "Literature")

        // Question 2
        const val QUESTION_2 = "What is your preferred learning style?"
        val OPTIONS_2 = listOf("Visual", "Auditory", "Kinesthetic", "Reading/Writing")

        // Question 3
        const val QUESTION_3 = "What are your career aspirations?"
        val OPTIONS_3 = listOf("Engineering", "Medicine", "Arts", "Business/Entrepreneurship")

        // Question 4
        const val QUESTION_4 = "What type of learner are you?"
        val OPTIONS_4 = listOf("Visual", "Auditory", "Reading/Writing", "Kinesthetic")

        // Question 5
        const val QUESTION_5 = "What is your preferred method of studying?"
        val OPTIONS_5 = listOf("Study alone", "Study in a group", "Online learning", "Hands-on/practical learning")

        // Question 6
        const val QUESTION_6 = "What is your career goal?"
        val OPTIONS_6 = listOf("Start my own business", "Work in a multinational company", "Pursue higher studies", "Enter the public sector")

        // Question 7
        const val QUESTION_7 = "What motivates you to succeed?"
        val OPTIONS_7 = listOf("Personal satisfaction", "Financial rewards", "Recognition and awards", "Making a positive impact on society")

        // Question 8
        const val QUESTION_8 = "How do you handle stress?"
        val OPTIONS_8 = listOf("Exercise or physical activity", "Talk to friends or family", "Meditation or relaxation techniques", "Take a break or go for a walk")

        // Question 9
        const val QUESTION_9 = "What is your preferred work environment?"
        val OPTIONS_9 = listOf("Fast-paced and dynamic", "Collaborative and team-oriented", "Quiet and focused", "Flexible and adaptable")

        // Question 10
        const val QUESTION_10 = "How do you handle setbacks or failures?"
        val OPTIONS_10 = listOf("Learn from mistakes and try again", "Seek advice or guidance from others", "Take time to reflect and reassess goals", "Stay positive and move forward with determination")

        // Question 11
        const val QUESTION_11 = "What are your strengths?"
        val OPTIONS_11 = listOf("Leadership skills", "Problem-solving abilities", "Creativity and innovation", "Adaptability and flexibility")

        // Question 12
        const val QUESTION_12 = "What are your weaknesses?"
        val OPTIONS_12 = listOf("Procrastination", "Difficulty with time management", "Lack of assertiveness", "Difficulty with public speaking")

        // Question 13
        const val QUESTION_13 = "How do you prefer to communicate with others?"
        val OPTIONS_13 = listOf("Face-to-face conversations", "Phone calls or voice messages", "Text messages or emails", "Social media or online platforms")

        // Question 14
        const val QUESTION_14 = "What do you value most in a job or career?"
        val OPTIONS_14 = listOf("Work-life balance", "Opportunities for growth and advancement", "Job security and stability", "Challenging and meaningful work")

        // Question 15
        const val QUESTION_15 = "How do you handle conflicts or disagreements?"
        val OPTIONS_15 = listOf("Open communication and compromise", "Seek mediation or third-party intervention", "Take time to cool off and revisit the issue later", "Avoid confrontation and try to find common ground")

        // Question 16
        const val QUESTION_16 = "What is your preferred leadership style?"
        val OPTIONS_16 = listOf("Authoritative", "Democratic", "Servant", "Transformational")

        // Question 17
        const val QUESTION_17 = "How do you stay organized and manage your time effectively?"
        val OPTIONS_17 = listOf("Make to-do lists and prioritize tasks", "Use calendars or planners to schedule activities", "Set goals and deadlines for yourself", "Delegate tasks or seek assistance when needed")

        // Question 18
        const val QUESTION_18 = "How do you stay motivated and productive?"
        val OPTIONS_18 = listOf("Set short-term and long-term goals", "Break tasks into smaller, manageable steps", "Reward yourself for completing tasks", "Surround yourself with supportive and positive influences")

        // Question 19
        const val QUESTION_19 = "How do you approach decision-making?"
        val OPTIONS_19 = listOf("Analyze the situation and weigh the pros and cons", "Trust your instincts and go with your gut feeling", "Seek advice and input from others before deciding", "Take your time and consider all possible outcomes")

        // Question 20
        const val QUESTION_20 = "What do you do in your free time?"
        val OPTIONS_20 = listOf("Engage in hobbies or creative activities", "Spend time with friends and family", "Read books or watch movies/TV shows", "Volunteer or participate in community service")

        // Question 21
        const val QUESTION_21 = "How do you handle feedback or constructive criticism?"
        val OPTIONS_21 = listOf("Accept feedback graciously and use it to improve", "Defend your actions or dismiss the feedback", "Reflect on the feedback and consider its validity", "Seek clarification or further explanation if needed")

        // Question 22
        const val QUESTION_22 = "What are your long-term career goals?"
        val OPTIONS_22 = listOf("Reach a senior leadership position in my field", "Start my own business or venture", "Make a significant impact in my industry or community", "Achieve financial independence and stability")

        // Question 23
        const val QUESTION_23 = "What do you consider to be your greatest achievement so far?"
        val OPTIONS_23 = listOf("Academic or professional accomplishments", "Overcoming personal challenges or obstacles", "Making a positive impact on others' lives", "Learning and growing as an individual")

        // Question 24
        const val QUESTION_24 = "How do you handle ambiguity or uncertainty?"
        val OPTIONS_24 = listOf("Embrace uncertainty and adapt to change", "Seek clarity and information to make informed decisions", "Consult with others or seek guidance when unsure", "Avoid situations that involve ambiguity or risk")

        // Question 25
        const val QUESTION_25 = "What are your short-term goals or priorities?"
        val OPTIONS_25 = listOf("Complete a specific project or task", "Improve a particular skill or competency", "Focus on personal development or self-care", "Explore new opportunities or experiences")
    }
    */
  object QuestionData {
      val questions: List<Question> = listOf(
          Question("What is your favorite subject?", listOf("Mathematics", "Science", "History", "Literature")),
          Question("What is your preferred learning style?", listOf("Visual", "Auditory", "Kinesthetic", "Reading/Writing")),
          Question("What are your career aspirations?", listOf("Engineering", "Medicine", "Arts", "Business/Entrepreneurship")),
          Question("What type of learner are you?", listOf("Visual", "Auditory", "Reading/Writing", "Kinesthetic")),
          Question("What is your preferred method of studying?", listOf("Study alone", "Study in a group", "Online learning", "Hands-on/practical learning")),
          Question("What is your career goal?", listOf("Start my own business", "Work in a multinational company", "Pursue higher studies", "Enter the public sector")),
          Question("What motivates you to succeed?", listOf("Personal satisfaction", "Financial rewards", "Recognition and awards", "Making a positive impact on society")),
          Question("How do you handle stress?", listOf("Exercise or physical activity", "Talk to friends or family", "Meditation or relaxation techniques", "Take a break or go for a walk")),
          Question("What is your preferred work environment?", listOf("Fast-paced and dynamic", "Collaborative and team-oriented", "Quiet and focused", "Flexible and adaptable")),
          Question("How do you handle setbacks or failures?", listOf("Learn from mistakes and try again", "Seek advice or guidance from others", "Take time to reflect and reassess goals", "Stay positive and move forward with determination")),
          Question("What are your strengths?", listOf("Leadership skills", "Problem-solving abilities", "Creativity and innovation", "Adaptability and flexibility")),
          Question("What are your weaknesses?", listOf("Procrastination", "Difficulty with time management", "Lack of assertiveness", "Difficulty with public speaking")),
          Question("How do you prefer to communicate with others?", listOf("Face-to-face conversations", "Phone calls or voice messages", "Text messages or emails", "Social media or online platforms")),
          Question("What do you value most in a job or career?", listOf("Work-life balance", "Opportunities for growth and advancement", "Job security and stability", "Challenging and meaningful work")),
          Question("How do you handle conflicts or disagreements?", listOf("Open communication and compromise", "Seek mediation or third-party intervention", "Take time to cool off and revisit the issue later", "Avoid confrontation and try to find common ground")),
          Question("What is your preferred leadership style?", listOf("Authoritative", "Democratic", "Servant", "Transformational")),
          Question("How do you stay organized and manage your time effectively?", listOf("Make to-do lists and prioritize tasks", "Use calendars or planners to schedule activities", "Set goals and deadlines for yourself", "Delegate tasks or seek assistance when needed")),
          Question("How do you stay motivated and productive?", listOf("Set short-term and long-term goals", "Break tasks into smaller, manageable steps", "Reward yourself for completing tasks", "Surround yourself with supportive and positive influences")),
          Question("How do you approach decision-making?", listOf("Analyze the situation and weigh the pros and cons", "Trust your instincts and go with your gut feeling", "Seek advice and input from others before deciding", "Take your time and consider all possible outcomes")),
          Question("What do you do in your free time?", listOf("Engage in hobbies or creative activities", "Spend time with friends and family", "Read books or watch movies/TV shows", "Volunteer or participate in community service")),
          Question("How do you handle feedback or constructive criticism?", listOf("Accept feedback graciously and use it to improve", "Defend your actions or dismiss the feedback", "Reflect on the feedback and consider its validity", "Seek clarification or further explanation if needed")),
          Question("What are your long-term career goals?", listOf("Reach a senior leadership position in my field", "Start my own business or venture", "Make a significant impact in my industry or community", "Achieve financial independence and stability")),
          Question("What do you consider to be your greatest achievement so far?", listOf("Academic or professional accomplishments", "Overcoming personal challenges or obstacles", "Making a positive impact on others' lives", "Learning and growing as an individual")),
          Question("How do you handle ambiguity or uncertainty?", listOf("Embrace uncertainty and adapt to change", "Seek clarity and information to make informed decisions", "Consult with others or seek guidance when unsure", "Avoid situations that involve ambiguity or risk")),
          Question("What are your short-term goals or priorities?", listOf("Complete a specific project or task", "Improve a particular skill or competency", "Focus on personal development or self-care", "Explore new opportunities or experiences"))
      )

      data class Question(val questionText: String, val options: List<String>)
  }

