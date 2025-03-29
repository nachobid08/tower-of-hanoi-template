
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

    private void solve(int a, int start, int end, int spare) {
        if (a==1){
            model.move(start, end);
            model.print();
            return;
        }
    }
    solve(a-1, start, spare, end);
    model.move(start, end);
    model.print();
    solve(n-1, spare, end, start);
    
}
