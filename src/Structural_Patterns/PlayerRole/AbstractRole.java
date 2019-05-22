package Structural_Patterns.PlayerRole;

public abstract class AbstractRole {

    // a map would be a better implementation, especially for languages with
    // facilities for that (groovy, ruby, python...)
    protected Object[] attributes = null;
    private Player player;

    protected AbstractRole() {
    }

    public void configure(Object[] objects) {
        attributes = objects;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        assert player != null;

        this.player = player;
    }
}