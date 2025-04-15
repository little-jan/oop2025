package lab6;

public class ParticleA extends Particle {
    @Override
    public Particle collide(Particle other) {
        if (other instanceof ParticleA || other instanceof ParticleB) {
            return new ParticleA();
        }
        return new ParticleB();
    }
}
