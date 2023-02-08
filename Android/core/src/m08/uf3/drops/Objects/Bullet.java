package m08.uf3.drops.Objects;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Bullet extends Actor {
    private Texture texture;
    private Vector2 position;
    private float xVelocity;
    private float yVelocity;

    public Bullet(float x, float y, float xVelocity, float yVelocity, Texture texture) {
        this.position = new Vector2(x, y);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
        this.texture = texture;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        position.x += xVelocity * delta;
        position.y += yVelocity * delta;
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        super.draw(batch, parentAlpha);
        batch.draw(texture, position.x, position.y);
    }
}