package lab6;

public class ParticleC extends Particle {
    @Override
    public Particle collide(Particle other) {
        if (other instanceof ParticleA) {
            return new ParticleC();
        }
        return new ParticleD();
    }
}
