package jp.ac.uryukyu.ie.e215715;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
    
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }


    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }
   
    /**
     * 名前を取得するメソッド
     * @return　エネミー名
     */
    public String getName(){
        return name;
    }

    /**
     * HPを取得するメソッド
     * @return エネミーのHP
     */
    public int getHitPoint(){
        return hitPoint;
    }

    /**
     * エネミーの攻撃力を取得するメソッド
     * @return　エネミーの攻撃力
     */
    public int getAttack(){
        return attack;
    }  
    
    /**
     * 名前を設定するメソッド
     * @param name　エネミー名
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * HPを設定するメソッド
     * @param hitPoint　エネミーのHP
     */
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    /**
     * 攻撃力を設定するメソッド
     * @param attack　エネミーの攻撃力
     */
    public void setAttack(int attack){
        this.attack = attack;
    }

    /**
     * 生存状態を設定するメソッド
     * @param dead エネミーの生存状態
     */
    public void setDead(boolean dead){
        this.dead = dead;
    }
}