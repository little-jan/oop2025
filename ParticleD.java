package lab6;

public class ParticleD extends Particle{
    @Override
    public Particle collide(Particle other) {
        if (other instanceof ParticleC || other instanceof ParticleD) {
            return new ParticleC();
        }
        return new ParticleA();
    }
}
