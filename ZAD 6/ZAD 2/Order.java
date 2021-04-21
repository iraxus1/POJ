package pl.edu.pja;

import java.util.ArrayList;

public class Order {
    public final ArrayList<Position> positions;
    public int maximumSize;

    public Order(ArrayList<Position> positions, int maximumSize) {
        this.positions = positions;
        this.maximumSize = maximumSize;
    }

    public Order(final ArrayList<Position> positions)
    {
        this(positions,10);
    }

    public void addPosition(final Position position)
    {
        if(this.positions.size() == maximumSize)
        {
            return;
        }
        this.positions.add(position);
    }

    @Override
    public String toString() {
        return "Order{" +
                "positions=" + positions +
                '}';
    }
}
