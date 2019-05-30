package Soccer;
class Soccer extends Sports{
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers(){
    	System.out.println(super.getName());
    	System.out.println( "Each team has n players in " + super.getName() );
    	System.out.println(getName());
    	super.getNumberOfTeamMembers();
    }
}