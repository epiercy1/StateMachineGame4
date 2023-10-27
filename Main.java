import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	private HashMap<StateType, State> states = new HashMap<StateType, State> ();
	
	public static void main(String[] args) {
		Main m = new Main();
		m.go();
	}
	public void go(){
		Model model = new Model();
		StateType currentStateType = model.getCurrentState();
		
		createStates(model);
		
		//output.println (enumValue);

		
		while(currentStateType != StateType.EndOfGame) {
			State currentState = states.get(currentStateType);
					
			String description = currentState.getDescription();
			System.out.println(description);
			
			ArrayList<String>options = currentState.getOptions();
			
			//print out the options
			//enumValue = EnumValue.valueOf(input.nextLine ());
			
			//get the user's choice
			
			//currentState.processChoice(choice);
			
			currentStateType = model.getCurrentState();
			
		}
	}
	
	public void createStates(Model model) {
		states.put(StateType.StreetOutsideHouse, new StreetOutsideHouse(model));
		states.put(StateType.OutsideSchoolBuilding, new OutsideSchoolBuilding(model));
		states.put(StateType.Classroom, new Classroom(model));
		states.put(StateType.Playground, new Playground(model));
		states.put(StateType.Auditorium, new Auditorium(model));
		states.put(StateType.Cafeteria, new Cafeteria(model));
		states.put(StateType.Hallway, new Hallway(model));
		states.put(StateType.LivingRoom, new LivingRoom(model));
		states.put(StateType.FrontLawn, new FrontLawn(model));
		states.put(StateType.Backstage, new Backstage(model));
	}
}
