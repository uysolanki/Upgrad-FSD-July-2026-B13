package day59;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByDemo2 {

	public static void main(String[] args) {
		List<String> months=Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December");
					//length>=5
		
		Map<Boolean,List<String>> hashmap=
				
		months.stream()
		.collect(Collectors.partitioningBy(m->m.length()>5));
		/*
		hashmap
		{
		true:[January","February","August","September","October","November","December"]
		false:["March","April","May","June","July"]
		}*/

		

		Map<Boolean,Long> hashmap1=
				months.stream()
				.collect(Collectors.partitioningBy(m->m.length()>5,Collectors.counting()));
		
		System.out.println(hashmap1);
		/*{
			true:7
			false:5
		}*/
		
		
		
		Map<Boolean,String> hashmap2=
				months.stream()
				.collect(Collectors.partitioningBy(m->m.length()>5,Collectors.joining()));
		System.out.println(hashmap2);
				
				/*{
				true:"JanuaryFebruaryAugustSeptemberOctoberNovemberDecember"]
				false:"MarchAprilMayJuneJuly"
				 */
		
		
		
		Map<Boolean,String> hashmap3=
				months.stream()
				.collect(Collectors.partitioningBy(m->m.length()>5,Collectors.joining("-")));
				System.out.println(hashmap3);
		/*{
		true:"January-February-August-September-October-November-December"]
		false:"March-April-May-June-July"
		 */
				
				Map<Boolean,String> hashmap4=
						months.stream()
						.collect(Collectors.partitioningBy(m->m.length()>5,Collectors.joining("-","$","#")));
						System.out.println(hashmap4);
				
				/*{
				true:"$January-February-August-September-October-November-December#"]
				false:"$March-April-May-June-July#"
				 */

	}

}

/*
hashmap
{
true:[January","February","August","September","October","November","December"]
false:["March","April","May","June","July"]
}


{
true:7
false:5
}


{
true:"JanuaryFebruaryAugustSeptemberOctoberNovemberDecember"]
false:"MarchAprilMayJuneJuly"
}
*/