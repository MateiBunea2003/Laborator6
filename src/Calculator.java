
    public class Calculator {
        protected float value;

        public Calculator(float value) {
            this.value = value;
        }

        public void add(float ather) {
            this.value += ather;
        }

        public void inmultire(float ather) {
            this.value *= ather;
        }

        public void imparte(float ather) {
            this.value /= ather;
        }

        public float getresult() {
            return this.value;
        }
    }