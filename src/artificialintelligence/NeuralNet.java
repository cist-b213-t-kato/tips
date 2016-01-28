package artificialintelligence;
import java.util.Random;

public class NeuralNet {

	static final int N_INPUT = 2;
	static final int N_HIDDEN = 2;
	static final int N_OUTPUT = 1;

	double w1[][];	//入力層>隠れ層の重み
	double w2[][];	//隠れ層>出力層の重み

	double input[];
	double hidden[];
	double output[];

	double alpha;	//学習率

	public NeuralNet(){

		input  = new double[N_INPUT];
		hidden = new double[N_HIDDEN];
		output = new double[N_OUTPUT];

		//重みを[-0.1, 0.1]で初期化
		Random rnd = new Random();

		w1 = new double[N_INPUT][N_HIDDEN];
		for(int i=0; i<N_INPUT; i++){
			for(int j=0; j<N_HIDDEN; j++){
				w1[i][j] = (rnd.nextDouble()*2.0 - 1.0) * 0.1;
			}
		}

		w2 = new double[N_HIDDEN][N_OUTPUT];
		for(int i=0; i<N_HIDDEN; i++){
			for(int j=0; j<N_OUTPUT; j++){
				w2[i][j] = (rnd.nextDouble()*2.0 - 1.0) * 0.1;
			}
		}

		//学習率の初期化
		alpha = 0.1;

	}


	//メイン関数
	public static void main(String[] args){

		//訓練データ（入力）
		double inputs[][] = {
				{1, 1},
				{1, 0},
				{0, 1},
				{0, 0}
		};
		//訓練データ（出力）
		double ress[][] = {
				{0.0},
				{1.0},
				{1.0},
				{0.0}
		};

		//BPによる学習
		NeuralNet nn = new NeuralNet();

		final double e2 = 0.1;
		while(true){

			//二乗誤差の総和
			double e = 0.0;

			//すべての訓練データについて、BP
			for(int i=0; i<4; i++){
				nn.compute(inputs[i]);
				nn.backPropagation(ress[i]);
				System.out.println("INPUT:" + inputs[i][0] + "," + inputs[i][1] + " -> " + nn.output[0] + "(" + ress[i][0] + ")");

				e += nn.calcError(ress[i]);
			}

			//二乗誤差が十分小さくなったら、終了
			System.out.println("Error = " + e);
			if(e < e2){
				System.out.println("Error < " + e2);
				break;
			}
		}

//		nn.compute(new double[]{1.0, 1.0});
//		System.out.println("output: " + nn.output[0]);

	}

	//NNに入力し、出力（＝Q値）を計算する
	public void compute(double in[]){

		//入力層
		for(int i=0; i<N_INPUT; i++){
			input[i] = (double)in[i];
		}

		//隠れ層の計算
		for(int i=0; i<N_HIDDEN; i++){
			hidden[i] = 0.0;
			for(int j=0; j<N_INPUT; j++){
				hidden[i] += w1[j][i] * input[j];
			}
			hidden[i] = sigmoid(hidden[i]);
		}

		//出力層（Q値）の計算
		for(int i=0; i<N_OUTPUT; i++){
			output[i] = 0.0;
			for(int j=0; j<N_HIDDEN; j++){
				output[i] += w2[j][i] * (hidden[j]);
			}
			output[i] = sigmoid(output[i]);
		}
	}

	//シグモイド関数
	public double sigmoid(double i){
		double a = 1.0 / (1.0 + Math.exp(-i));
		return a;
	}

	//誤差逆伝播法による重みの更新
	public void backPropagation(double teach[]){

		//隠れ>出力の重みを更新
		for(int i=0; i<N_OUTPUT; i++){
			for(int j=0; j<N_HIDDEN; j++){
				double delta = -alpha*( -(teach[i]-output[i])*output[i]*(1.0-output[i])*hidden[j] );
				w2[j][i] += delta;
			}
		}

		//入力>隠れの重みを更新
		for(int i=0; i<N_HIDDEN; i++){

			double sum = 0.0;
			for(int k=0; k<N_OUTPUT; k++){
				sum += w2[i][k]*(teach[k]-output[k])*output[k]*(1.0-output[k]);
			}

			for(int j=0; j<N_INPUT; j++){
				double delta = alpha*hidden[i]*(1.0-hidden[i])*input[j]*sum;
				w1[j][i] += delta;
			}
		}
	}

	//二乗誤差
	public double calcError(double teach[]){
		double e = 0.0;
		for(int i=0; i<N_OUTPUT; i++){
			e += Math.pow(teach[i]-output[i], 2.0);
		}
		e *= 0.5;
		return e;
	}

}