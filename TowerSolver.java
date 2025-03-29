
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(model.getHeight(), 0, 2, 1);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

    private void solve(int a, int source, int destination, int spare) 
    {
        

        if (a==1){
            model.move(source, destination);
            return;
        }

        solve(a-1, source, spare, destination);
        model.move(source, destination);
        solve(a-1, spare, destination, source);
    
    }



}
