select count(*) as count
from ecoli_data
where conv(genotype, 10, 2) not like '%1_' 
and (conv(genotype, 10, 2) like '%1' or conv(genotype, 10, 2) like '%1__')