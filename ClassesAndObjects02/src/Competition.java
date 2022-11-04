public class Competition {
    public static void main (String args[]){
        CompetitionRules rules = new CompetitionRules();
        rules.printRules();
        Team teamA = new Team();
        Team teamB = new Team();

        teamA.teamName = "Develhope1";
        teamB.teamName = "Develhope2";

      teamA.p1.name = "Paolo";
      teamA.p1.yearsOfExperience = 22;
      teamA.p1.programmingLanguage = "Java";

      teamA.p2.name = "Teresa";
      teamA.p2.yearsOfExperience = 22;
      teamA.p2.programmingLanguage = "C";

      teamB.p1.name = "Ace";
      teamB.p1.yearsOfExperience = 22;
      teamB.p1.programmingLanguage = "Javascript";

      teamB.p2.name = "Fragola";
      teamB.p2.yearsOfExperience = 22;
      teamB.p2.programmingLanguage = "Java";

      teamA.printTeamDetails();
      teamB.printTeamDetails();
    }

}
