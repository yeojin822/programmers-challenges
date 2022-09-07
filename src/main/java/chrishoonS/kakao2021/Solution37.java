package chrishoonS.kakao2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution37 {
    static int[] map;
    static int M;
    static String cur;
    static HashMap<String, Integer> hmap;

    public static void Eval() {
        String t ="";
        for (int i=0; i<M; i++)
            if (map[i] == 1)
                t = t+cur.charAt(i);
        if (hmap.containsKey(t) == true)
            hmap.put(t, hmap.get(t) +1);
        else
            hmap.put(t, 1);
    }

    public static void Combi(int t, int n) {
        int i;

        if (t == n) {
            for (i=0; i<t; i++)
                map[i] = 1;
            Eval();
            return;
        }
        if (n == 0) {
            for (i=0; i<t; i++)
                map[i] = 0;
            Eval();
            return;
        }
        map[t-1] = 0;
        Combi(t-1, n);
        map[t-1] = 1;
        Combi(t-1, n-1);
    }

    static String[] solution (String[] s, int[] a) {
        hmap = new HashMap<String, Integer> ();
        for (int i=0; i<s.length; i++) {
            char[] chars = s[i].toCharArray();
            Arrays.sort(chars);
            s[i] = new String(chars);

            M = s[i].length();
            map = new int[M];
            cur = s[i];
            for (int j =0; j<a.length; j++)
                if (M < a[j]) continue;
                else Combi(M, a[j]);
        }

        int[] mm = new int[11];
        int cnt = 0;
        for( String key : hmap.keySet() )
            if( hmap.get(key) > 1) {
                int ll = key.length();
                int val = hmap.get(key);
                if (val > mm[ll]) mm[ll] = val;
            }

        ArrayList<String> rr = new ArrayList<String> ();
        for( String key : hmap.keySet() ) {
            int val = hmap.get(key);
            for (int i=0; i<a.length; i++) {
                if (key.length() == a[i] && val == mm[a[i]])
                    rr.add(key);
            }
        }

        String[] r = new String[rr.size()];
        cnt=0;
        for (String u: rr)
            r[cnt++] = u;
        Arrays.sort(r);

        return r;
    }
}