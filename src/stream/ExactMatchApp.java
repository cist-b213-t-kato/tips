package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 完全一致(exact match)するものでグルーピング化する
 * 全くの未完成
 * */
@Deprecated
public class ExactMatchApp {

    public static class Genre {
        long id;
        public Genre(long id) {
            this.id = id;
        }
    }

    public static class LectureCae {
        long id;
        List<Genre> genreList;
        public LectureCae(long id, List<Genre> genreList) {
            this.id = id;
            this.genreList = genreList;
        }
    }

    public static void main( String[] args ) {

        List<LectureCae> caeList = new ArrayList<>();

        caeList.add(new LectureCae(1, Arrays.asList(new Genre(1), new Genre(2))));
        caeList.add(new LectureCae(2, Arrays.asList(new Genre(1), new Genre(2))));
        caeList.add(new LectureCae(3, Arrays.asList(new Genre(1))));
        caeList.add(new LectureCae(4, Arrays.asList(new Genre(2))));

        List<List<LectureCae>> caeListList = new ArrayList<>();

//        for ( int i=0; i<caeList.size(); i++ ) {
//            LectureCae cae1 = caeList.get(i);
//            List<LectureCae> groupList = new ArrayList<>();
//            groupList.add(cae1);
//            for ( int j=i+1; j<caeList.size(); j++ ) {
//                LectureCae cae2 = caeList.get(j);
//                if ( cae1.genreList.size() == cae2.genreList.size() ) {
//                    groupList.add(cae2);
//                }
////                for ( Genre genre : cae2.genreList ) {
////
////                }
//            }
//            caeListList.add(groupList);
//        }

        Iterator<LectureCae> itr = caeList.iterator();

        while ( itr.hasNext() ) {
            LectureCae cae = itr.next();
            itr.remove();
            for ( List<LectureCae> tmpCaeList : caeListList ) {
                LectureCae tmpCae = tmpCaeList.get(0);
                if ( tmpCae!=null && cae.genreList.size() == tmpCae.genreList.size() ) {
                    tmpCaeList.add(cae);
                }
            }

        }

        caeListList.forEach(list->{
            list.forEach(o->System.out.print(o.id + ", "));
            System.out.println();
        });

//        caeListList.forEach(list->{
//            list.forEach(o->System.out.print(o.id + ", "));
//            System.out.println();
//        });

    }

}


